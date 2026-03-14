package com.example.autowireddemo.model;

import org.springframework.stereotype.Component;

@Component
public class Certification {

    private int id;
    private String name;
    private String dateOfCompletion;

    public Certification() {
        this.id = 101;
        this.name = "Java Programming";
        this.dateOfCompletion = "2026-03-10";
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDateOfCompletion() {
        return dateOfCompletion;
    }

    @Override
    public String toString() {
        return "Certification [id=" + id + ", name=" + name + 
               ", dateOfCompletion=" + dateOfCompletion + "]";
    }
}