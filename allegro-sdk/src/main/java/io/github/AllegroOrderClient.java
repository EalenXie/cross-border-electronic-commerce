package io.github;


import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.dto.*;
import io.github.vo.*;
import io.github.vo.checkoutform.CheckoutForm;
import io.github.vo.orderevent.OrderEvent;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Map;

/**
 * Created by EalenXie on 2022/2/21 12:59
 * 接口文档地址 : https://developer.allegro.pl/documentation
 * https://developer.allegro.pl/documentation/#tag/Order-management
 */
public class AllegroOrderClient extends AllegroClient {

    private final ObjectMapper mapper;

    public AllegroOrderClient() {
        this(new RestTemplate());
    }

    public AllegroOrderClient(RestOperations restOperations) {
        this(new ObjectMapper(), restOperations);
    }

    public AllegroOrderClient(ObjectMapper objectMapper, RestOperations restOperations) {
        super(restOperations);
        this.mapper = objectMapper;
    }

    /**
     * 获取用户订单
     * 接口文档  https://developer.allegro.pl/documentation/#operation/getListOfOrdersUsingGET
     *
     * @param dto         用户订单查询参数
     * @param accessToken 令牌
     * @return {@link CheckoutForms} 订单详情
     */
    public CheckoutForms userOrders(OrdersDTO dto, String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        Map<String, String> args = mapper.convertValue(dto, new TypeReference<Map<String, String>>() {
        });
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/order/checkout-forms", isSandBox() ? API_SANDBOX_HOST : API_HOST));
        LinkedMultiValueMap<String, String> req = new LinkedMultiValueMap<>();
        req.setAll(args);
        builder.queryParams(req);
        URI uri = builder.build().encode().toUri();
        ResponseEntity<CheckoutForms> exchange = getRestOperations().exchange(uri, HttpMethod.GET, new HttpEntity<>(null, headers), CheckoutForms.class);
        return exchange.getBody();
    }

    /**
     * 获取订单详情
     * 接口文档  https://developer.allegro.pl/documentation/#operation/getOrdersDetailsUsingGET
     *
     * @param orderId     订单Id
     * @param accessToken 令牌
     * @return {@link CheckoutForm} 订单详情
     */
    public CheckoutForm ordersDetails(String orderId, String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        ResponseEntity<CheckoutForm> exchange = getRestOperations().exchange(URI.create(String.format("%s/order/checkout-forms/%s", isSandBox() ? API_SANDBOX_HOST : API_HOST, orderId)), HttpMethod.GET, new HttpEntity<>(null, headers), CheckoutForm.class);
        return exchange.getBody();
    }

    /**
     * 订单标记发货
     * https://developer.allegro.pl/documentation/#operation/createOrderShipmentsUsingPOST
     *
     * @param orderId     订单Id
     * @param dto         标记发货请求参数
     * @param accessToken 请求token
     * @return {@link Shipment} 标记发货
     */
    public Shipment shipments(String orderId, ShipmentDTO dto, String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        HttpEntity<ShipmentDTO> mapHttpEntity = new HttpEntity<>(dto, headers);
        ResponseEntity<Shipment> exchange = getRestOperations().exchange(String.format("%s/order/checkout-forms/%s/shipments", isSandBox() ? API_SANDBOX_HOST : API_HOST, orderId), HttpMethod.POST, mapHttpEntity, Shipment.class);
        return exchange.getBody();
    }

    /**
     * 获取物流追踪号
     * https://developer.allegro.pl/documentation/#operation/getOrderShipmentsUsingGET
     *
     * @param orderId     订单Id
     * @param accessToken 请求token
     * @return {@link Shipment} 物流返回对象
     */
    public Shipment shipments(String orderId, String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        ResponseEntity<Shipment> exchange = getRestOperations().exchange(String.format("%s/order/checkout-forms/%s/shipments", isSandBox() ? API_SANDBOX_HOST : API_HOST, orderId), HttpMethod.GET, new HttpEntity<>(null, headers), Shipment.class);

        return exchange.getBody();
    }


    /**
     * https://developer.allegro.pl/documentation/#operation/getOrderEventsUsingGET
     *
     * @param dto         事件查询参数
     * @param accessToken 请求token
     * @return {@link OrderEvent}
     */
    public OrderEvent events(OrderEventDTO dto, String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        Map<String, String> args = mapper.convertValue(dto, new TypeReference<Map<String, String>>() {
        });
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(String.format("%s/order/events", isSandBox() ? API_SANDBOX_HOST : API_HOST));
        LinkedMultiValueMap<String, String> req = new LinkedMultiValueMap<>();
        req.setAll(args);
        builder.queryParams(req);
        ResponseEntity<OrderEvent> exchange = getRestOperations().exchange(builder.build().encode().toUri(), HttpMethod.GET, new HttpEntity<>(null, headers), OrderEvent.class);
        return exchange.getBody();
    }

    /**
     * https://developer.allegro.pl/documentation/#operation/getOrderEventsStatisticsUsingGET
     *
     * @param accessToken 请求token
     * @return {@link EventStats}
     */
    public EventStats eventStats(String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        ResponseEntity<EventStats> exchange = getRestOperations().exchange(String.format("%s/order/event-stats", isSandBox() ? API_SANDBOX_HOST : API_HOST), HttpMethod.GET, new HttpEntity<>(null, headers), EventStats.class);
        return exchange.getBody();
    }


    /**
     * https://developer.allegro.pl/documentation/#operation/getOrdersCarriersUsingGET
     *
     * @param accessToken 请求token
     * @return {@link OrderCarriers}
     */
    public OrderCarriers orderCarriers(String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        ResponseEntity<OrderCarriers> exchange = getRestOperations().exchange(String.format("%s/order/carriers", isSandBox() ? API_SANDBOX_HOST : API_HOST), HttpMethod.GET, new HttpEntity<>(null, headers), OrderCarriers.class);
        return exchange.getBody();
    }


    /**
     * 修改订单状态
     * https://developer.allegro.pl/documentation/#operation/setOrderFulfillmentUsingPUT
     *
     * @param orderId     订单Id
     * @param dto         修改订单状态请求参数
     * @param accessToken 请求token
     */
    public void fulfillment(String orderId, FulfillmentDTO dto, String accessToken) {
        getRestOperations().put(String.format("%s/order/checkout-forms/%s/fulfillment", isSandBox() ? API_SANDBOX_HOST : API_HOST, orderId), new HttpEntity<>(dto, getBearerHeaders(accessToken)));
    }

    /**
     * 发票
     * https://developer.allegro.pl/documentation/#operation/getOrderShipmentsUsingGET
     *
     * @param orderId     订单Id
     * @param accessToken 请求token
     * @return {@link Invoices} 发票
     */
    public Invoices invoices(String orderId, String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        ResponseEntity<Invoices> exchange = getRestOperations().exchange(String.format("%s/order/checkout-forms/%s/invoices", isSandBox() ? API_SANDBOX_HOST : API_HOST, orderId), HttpMethod.GET, new HttpEntity<>(null, headers), Invoices.class);
        return exchange.getBody();
    }


    /**
     * 新增发票
     * https://developer.allegro.pl/documentation/#operation/addOrderInvoicesMetadata
     *
     * @param orderId     订单Id
     * @param dto         发票请求参数
     * @param accessToken 请求token
     * @return {@link IdVO} IdVO
     */
    public IdVO invoices(String orderId, InvoicesDTO dto, String accessToken) {
        HttpHeaders headers = getBearerHeaders(accessToken);
        ResponseEntity<IdVO> exchange = getRestOperations().exchange(String.format("%s/order/checkout-forms/%s/invoices", isSandBox() ? API_SANDBOX_HOST : API_HOST, orderId), HttpMethod.POST, new HttpEntity<>(dto, headers), IdVO.class);
        return exchange.getBody();
    }


}
