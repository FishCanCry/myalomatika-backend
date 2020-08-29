package com.cryfish.myalomatika.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MentalNumber {
    private static final Logger log = LogManager.getLogger(MentalNumber.class);

    @JsonProperty("Number")
    private String number;

    @JsonProperty("Color")
    private String color;

    public MentalNumber() {
    }

    public MentalNumber(String number, String color) {
        this.number = number;
        this.color = color;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return number;
    }

    public String toJson(){
        ObjectMapper mapper = new ObjectMapper();
        String jsonObject = null;
        try {
            jsonObject = mapper.writeValueAsString(this);
        } catch (JsonProcessingException e) {
            log.error("Error during converting MentalNumber Object to Json", e);
        }
        return jsonObject;
    }
}
