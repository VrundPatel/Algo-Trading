package com.hivemindcap.algotrading.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;

@Controller
public class PriceController {

    // TODO: Move to app properties;
    String apiUrl = "https://api.tdameritrade.com/v1/marketdata/MSFT/pricehistory?apikey=DZTXGZ4WFXPMOHQI4PJRKJUMSRNTGTM3&periodType=day&period=2&frequencyType=minute";
    String apiKey = "DZTXGZ4WFXPMOHQI4PJRKJUMSRNTGTM3";

    @GetMapping("/price")
    public void getPrice() {
        RestTemplate restTemplate = new RestTemplate();
        String result = restTemplate.getForObject(apiUrl, String.class);
        System.out.println();
    }
}
