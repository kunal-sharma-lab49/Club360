package com.hackathon.client360.service;

import com.hackathon.client360.graphql.intelligence.model.Intelligence;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Service
public class IntelligenceAnalyticsApiService {

    @Value("${intelligence.url}")

    private String intelligenceURL;


    private final RestTemplate restTemplate;

    public IntelligenceAnalyticsApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Intelligence getIntelligenceAnalyticData(){

        MultiValueMap<String,String> headers = new LinkedMultiValueMap<>();
        headers.add("x-api-key", "f81af0ff-3f81-4597-b5a3-fd0e4c1b7a77");
        ResponseEntity<Intelligence> responseEntity = restTemplate.
                exchange(intelligenceURL, HttpMethod.GET,new HttpEntity<>(null,headers), Intelligence.class );
    return responseEntity.getBody();
    }
}
