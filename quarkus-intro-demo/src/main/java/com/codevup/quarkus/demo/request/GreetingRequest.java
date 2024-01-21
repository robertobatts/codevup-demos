package com.codevup.quarkus.demo.request;

import com.fasterxml.jackson.annotation.JsonCreator;

public class GreetingRequest {

    private String name;

    @JsonCreator
    public GreetingRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
