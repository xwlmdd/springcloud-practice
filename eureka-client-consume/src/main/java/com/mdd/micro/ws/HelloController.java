package com.mdd.micro.ws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class HelloController {

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return restTemplate.getForEntity("http://eureka-client-hello/hello", String.class).getBody();
    }

}


