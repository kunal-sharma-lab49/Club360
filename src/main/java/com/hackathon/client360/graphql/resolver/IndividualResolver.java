package com.hackathon.client360.graphql.resolver;

import com.hackathon.client360.graphql.individual.model.Individual;
import com.hackathon.client360.service.IndividualAnalyticsApiService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;

@Component

public class IndividualResolver implements GraphQLQueryResolver {

    private final IndividualAnalyticsApiService individualService;

    public IndividualResolver(IndividualAnalyticsApiService individualService) {
        this.individualService = individualService;
    }

    @QueryMapping
    public Individual getIndividual(){
        return individualService.getIndividualAnalyticData();
    }


//    public Individual getIndividualById(Integer){
//        return individualService.getIndividualAnalyticData();
//    }
}
