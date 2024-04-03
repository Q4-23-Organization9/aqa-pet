package com.example.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class User {

    private String name;
    private String job;


    @JsonCreator
    public User(@JsonProperty("name") String name, @JsonProperty("job") String job) {
        this.name = name;
        this.job = job;
    }


    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }


    public String toJson() {
        try {

            ObjectMapper mapper = new ObjectMapper();

            return mapper.writeValueAsString(this);
        } catch (IOException e) {

            e.printStackTrace();
            return null;
        }
    }


}
