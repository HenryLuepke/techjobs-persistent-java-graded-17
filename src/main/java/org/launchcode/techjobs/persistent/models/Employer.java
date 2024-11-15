package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location cannot be blank")
    @Size(max = 255, message = "Location is too long")
    private String location;

    public Employer() {}

    public Employer(String location) {
        this.location = location;
    }

    public  String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
