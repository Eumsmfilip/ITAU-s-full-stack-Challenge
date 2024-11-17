package com.itau.research.domain;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String name;
    private String lastName;
    private double userParticipation;
    private boolean active;

    public User(String name, String lastName, double userParticipation, boolean active) {
        this.name = name;
        this.lastName = lastName;
        this.userParticipation = userParticipation;
        this.active = true;
    }

    public User() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUserParticipation() {
        return userParticipation;
    }

    public void setUserParticipation(double userParticipation) {
        this.userParticipation = userParticipation;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
