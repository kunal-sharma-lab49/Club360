package com.hackathon.client360.graphql.individual.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class IndividualResult {
    public String id;
    public List<IndividualProductURL> productURLs;
    public String fullName;
    public List<Role> roles;
    public Address address;
   // public Date publishDate;
}

