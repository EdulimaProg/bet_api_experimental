package com.lagadoinc.bet_api.Model.LoteirasModels;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TodasLoterias {
    @JsonProperty("MyArray")
    List<String> myArray;

    public List<String> getMyArray() {
        return this.myArray;
    }

    public void setMyArray(List<String> myArray) {
        this.myArray = myArray;
    }
}
