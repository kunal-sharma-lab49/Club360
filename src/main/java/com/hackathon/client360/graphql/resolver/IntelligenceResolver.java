package com.hackathon.client360.graphql.resolver;

import com.hackathon.client360.graphql.intelligence.model.Intelligence;
import com.hackathon.client360.service.IntelligenceAnalyticsApiService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;

@Component

public class IntelligenceResolver implements GraphQLQueryResolver {

    private final IntelligenceAnalyticsApiService intelligenceAnalyticsApiService;

    public IntelligenceResolver(IntelligenceAnalyticsApiService intelligenceAnalyticsApiService) {
        this.intelligenceAnalyticsApiService = intelligenceAnalyticsApiService;
    }

    @QueryMapping
    public Intelligence getIntelligence(){
        return intelligenceAnalyticsApiService.getIntelligenceAnalyticData();
    }

}
