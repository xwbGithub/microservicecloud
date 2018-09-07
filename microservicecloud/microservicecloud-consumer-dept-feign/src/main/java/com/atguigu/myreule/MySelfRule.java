package com.atguigu.myreule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义负载均衡算法
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule() {
        //默认为轮询
        //return new RandomRule();
        return new RandomRule_ZY();
    }
}
