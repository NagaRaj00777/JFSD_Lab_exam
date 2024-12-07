package com.klu.jfsd.exam;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car extends Vehicle {

    @Column(name = "no_of_doors")
    private int noOfDoors;

    // Getters and setters
    public int getNoOfDoors() {
        return noOfDoors;
    }

    public void setNoOfDoors(int noOfDoors) {
        this.noOfDoors = noOfDoors;
    }
}
