package io.github;


import io.github.vo.AmazonResponse;
import io.github.vo.order.AmazonOrder;

class AmazonClientTest {


    public static void main(String[] args) {

        AmazonClient amazonClient= new AmazonClient();

        AmazonResponse<AmazonOrder> order = amazonClient.getOrder("114-4947842-2949825",
                "Atza|IwEBIIYELmf-gSjBZiGTyakvK39D7wGGqer2YXfVdKf7AjEXkGs_UypjCV-yHtWS_teol2UIOgn3cPyfUNXKDLU6T9v1R9lkHzy4_7AXahs00ns0eKeNsYGwEJpDJlu-EtRRDtEmaB15FddE__ZW_S952p184dMR3PtHDLxEUQsOtZ0");

        System.out.println(order);
    }
}