package com.example.webapp.Entity;

public class Pacient {
    private String key;
    private String value;

    // Constructor
    public Pacient(String key, String value) {
        this.key = key;
        this.value = value;
    }

    // Getters and setters
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}