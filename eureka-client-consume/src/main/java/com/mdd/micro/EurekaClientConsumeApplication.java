package com.mdd.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mdd.micro.config")
@EnableDiscoveryClient
public class EurekaClientConsumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientConsumeApplication.class, args);
    }
}
