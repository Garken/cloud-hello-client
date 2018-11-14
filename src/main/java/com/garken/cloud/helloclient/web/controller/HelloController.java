package com.garken.cloud.helloclient.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by P0007221 on 2018/11/14.
 */
@RestController
@RequestMapping("/rest/hello/client")
public class HelloController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/sayHello")
    public String sayHello() {
        String url = "http://hello-service/rest/hello/service/replyHello";
        return restTemplate.getForObject(url, String.class);
    }
}
