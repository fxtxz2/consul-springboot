package com.zyl.consulconsumer.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DemoController {

    private final RestTemplate restTemplate;

    public DemoController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @RequestMapping("/")
    public String home() {
        return restTemplate.getForObject("http://consul-producer/", String.class);
    }
}
