package com.hackathon.client360.graphql.individual.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Role {
    public String mmgid;
    public String name;
    public Company company;
    public double stake;
}

