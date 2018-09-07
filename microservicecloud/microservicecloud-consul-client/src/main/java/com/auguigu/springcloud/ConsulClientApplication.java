package com.auguigu.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by steve on 2018/8/29.
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConsulClientApplication.class, args);
    }

}