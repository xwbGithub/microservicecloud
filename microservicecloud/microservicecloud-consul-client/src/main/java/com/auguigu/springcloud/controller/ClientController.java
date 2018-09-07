package com.auguigu.springcloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by steve on 2018/8/29.
 */
@RestController
public class ClientController {

    @Autowired
    public DiscoveryClient discoveryClient;

    @Autowired
    public LoadBalancerClient loadBalancer;

    @RequestMapping(value = "/services", method = RequestMethod.GET)
    public Object services() {
        return discoveryClient.getInstances("consul-server");
    }

    @RequestMapping("/discovery")
    public Object discovery() {
        return loadBalancer.choose("consul-server").getUri().toString();
    }
}