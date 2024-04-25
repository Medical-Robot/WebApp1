package com.example.webapp.Entity;

public class Pacient {
    private String id;
    private String date;
    // Add more properties as needed

    // Constructor
    public Pacient(String id, String date) {
        this.id = id;
        this.date = date;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    // Add more getters and setters as needed
}
