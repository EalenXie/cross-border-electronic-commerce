package io.github;


import io.github.vo.AmazonResponse;
import io.github.vo.order.AmazonOrder;

class AmazonClientTest {


    public static void main(String[] args) {

        AmazonClient amazonClient= new AmazonClient();

        AmazonResponse<AmazonOrder> order = amazonClient.getOrder("114-4947842-2949825",
                "Atza|IwEBIIYELmf-gSjBZiGTyakvK39D7wGGqerOQBw4Yd6PrSOZX7scT65riemjvDKpTAAtCn0ztFIy3UWs_WFhAypen0uXFg2YXfVdKf7AjEXkG0bCLqw_47wSPjjx6FX3wwPGSvN0zHgNEP8_ZM_w90yI9Tk_HhCbbiLEgC-qpVeCLEiSZQR71OMKiJ7OFM-BIP5h1LWgo_s_UypjCV-yHtWS_teol2UIOgn3cPyfUNXKDLU6T9v1R9lkHzy4_7AXahs00ns0eKeNsYGwEJpDJlu-EtRRDtEmaB15FddE__ZW_S952p184dMR3PtHDLxEUQsOtZ0");

        System.out.println(order);
    }
}