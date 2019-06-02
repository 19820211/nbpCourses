package com.example.nbp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class Currency {

    public String currency;

    private String code;

    private List<Rate> rates = new ArrayList<>();

}
