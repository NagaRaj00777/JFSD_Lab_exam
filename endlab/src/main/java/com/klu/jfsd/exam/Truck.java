package com.klu.jfsd.exam;

import javax.persistence.*;

@Entity
@Table(name = "truck")
public class Truck extends Vehicle {

    @Column(name = "load_capacity")
    private int loadCapacity;

    // Getters and setters
    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}
