package com.hackathon.client360.graphql;

import com.hackathon.client360.graphql.resolver.IndividualResolver;
import com.hackathon.client360.graphql.resolver.IntelligenceResolver;
import graphql.ExecutionInput;
import graphql.ExecutionResult;
import graphql.GraphQL;
import graphql.kickstart.tools.SchemaParser;
import graphql.schema.GraphQLSchema;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GraphQLController {
    private final GraphQL graphQL;

    @Autowired
    public GraphQLController(IndividualResolver individualResolver, IntelligenceResolver intelligenceResolver) {
        GraphQLSchema schema = SchemaParser.newParser()
                .file("graphql/schema.graphql") // Path to your GraphQL schema definition file
                .resolvers(individualResolver,intelligenceResolver)
                .build()
                .makeExecutableSchema();

        this.graphQL = GraphQL.newGraphQL(schema).build();
    }

    @PostMapping("/graphql")
    public ExecutionResult executeGraphQLQuery(@RequestBody String query) {

        ExecutionInput executionInput = ExecutionInput.newExecutionInput()
                .query(query)
                .build();

        return graphQL.execute(executionInput);
    }


}
