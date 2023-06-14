
package com.hackathon.client360.graphql.intelligence.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {

    private String body;
    private List<CompanyRelationshipGroup> companyRelationshipGroups;
    private ContentClassification contentClassification;
    private List<Country> countries;
    private DominantCountry dominantCountry;
    private DominantSector dominantSector;
    private DominantState dominantState;
    private Geographies geographies;
    private String grade;
    private String headline;
    private List<IntelligenceType> intelligenceTypes;
    private Boolean isProprietary;
    private String lastModifiedDate;
    private String mmgid;
    private List<MunicipalsSector> municipalsSectors;
    private ProductAttributes productAttributes;
    private List<ProductEdition> productEditions;
    private List<ProductURL> productURLs;
    private List<PublicSource> publicSources;
    private String publishDate;
    private List<Sector> sectors;
    private List<Topic> topics;

}
