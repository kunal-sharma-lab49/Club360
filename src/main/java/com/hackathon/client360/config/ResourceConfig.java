package com.hackathon.client360.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ResourceConfig {

    @Bean
    public RestTemplate restTesmplate() {
        return new RestTemplate();
    }

//    @Bean
//    public GraphQL graphQL(){
//        return new GraphQL.newGraphQL()
//    }
}
