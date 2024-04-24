package io.zgc.coupon.customer;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.reactive.function.client.WebClient;

@org.springframework.context.annotation.Configuration
public class Configuration {

    // 注册bean并添加负载均衡功能
    @Bean
    @LoadBalanced
    public WebClient.Builder register() {
        return WebClient.builder();
    }

}
