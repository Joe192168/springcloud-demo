package com.gateway.config;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

@Component
public class Config {

//    @Bean
//    public KeyResolver ipKeyResolver() {
//        return exchange -> Mono.just(exchange.getRequest().getRemoteAddress().getHostName());
//    }


    @Bean
    public KeyResolver userKeyResolver() {
        return exchange -> Mono.just(exchange.getRequest().getQueryParams().getFirst("user"));
    }
}
