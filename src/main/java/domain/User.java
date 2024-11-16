package domain;

import jakarta.persistence.*;

import java.util.UUID;

@Entity
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private UUID id;
    private String name;
    private String lastName;
    private double userParticipation;

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

    public User(UUID id, String name, String lastName, double userParticipation) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.userParticipation = userParticipation;
    }

    public User (){
    }

}
