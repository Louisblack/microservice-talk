package org.bk.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RootConfiguration {

    @Bean
    @Primary
    public RestOperations nonLoadbalancedRestTemplate() {
        return new RestTemplate();
    }

    @Bean
    @LoadBalanced
    public RestOperations loadbalancedRestTemplate() {
        return new RestTemplate();
    }

}
