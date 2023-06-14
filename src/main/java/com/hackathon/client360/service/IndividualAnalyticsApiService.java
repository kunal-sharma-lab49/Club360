package com.hackathon.client360.service;

import com.hackathon.client360.graphql.individual.model.Individual;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import static org.springframework.http.HttpHeaders.AUTHORIZATION;

@Service
public class IndividualAnalyticsApiService {

    @Value("${individual.access.token}")
    private String accessToken;

    @Value("${individual.url}")

    private String individualURL;



    private final RestTemplate restTemplate;

    public IndividualAnalyticsApiService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Individual getIndividualAnalyticData(){

        MultiValueMap<String,String> headers = new LinkedMultiValueMap<>();
        headers.add(AUTHORIZATION, "Bearer " + accessToken);
        ResponseEntity<Individual> responseEntity = restTemplate.
                exchange(individualURL, HttpMethod.GET,new HttpEntity<>(null,headers),Individual.class );
    return responseEntity.getBody();

    }

}
