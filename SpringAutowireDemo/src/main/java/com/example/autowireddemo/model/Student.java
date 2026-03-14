package com.example.autowireddemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private int id = 1;
    private String name = "Vaishnavi";
    private String gender = "Female";

    @Autowired
    private Certification certification;

    public void displayStudentDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Certification Details: " + certification);
    }
}