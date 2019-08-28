package com.demo.htmldemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author: wjc
 * @description: com.demo.htmldemo
 * @date:2019-08-28
 */
@SpringBootApplication
@EnableDiscoveryClient
public class HtmlDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(HtmlDemoApplication.class, args);
    }
}
