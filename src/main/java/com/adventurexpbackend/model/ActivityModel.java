package com.adventurexpbackend.model;

import jakarta.persistence.*;

@Entity
public class ActivityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private int ageLimit;
    private double price;

    // Constructors
    public ActivityModel() {}

    public ActivityModel(String name, String description, int ageLimit, double price) {
        this.name = name;
        this.description = description;
        this.ageLimit = ageLimit;
        this.price = price;
    }

    // Getters & Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public int getAgeLimit() { return ageLimit; }
    public void setAgeLimit(int ageLimit) { this.ageLimit = ageLimit; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
}

