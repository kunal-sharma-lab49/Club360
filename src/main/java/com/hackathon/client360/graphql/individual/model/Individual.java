package com.hackathon.client360.graphql.individual.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Individual {

    public int hits;
    public String firstCursor;
    public String lastCursor;
    public List<IndividualResult> results;
}

