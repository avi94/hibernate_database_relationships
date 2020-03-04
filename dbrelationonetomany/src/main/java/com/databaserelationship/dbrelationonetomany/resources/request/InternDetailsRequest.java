package com.databaserelationship.dbrelationonetomany.resources.request;

import com.databaserelationship.dbrelationonetomany.resources.embed.Address;
import com.databaserelationship.dbrelationonetomany.resources.entity.Interns;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter @AllArgsConstructor
public class InternDetailsRequest {

    @JsonProperty("intern_id")
    private Long id;

    @JsonProperty("address")
    private Address address;
}