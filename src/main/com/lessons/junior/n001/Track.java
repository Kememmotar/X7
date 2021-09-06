package com.lessons.junior.n001;

public class Track extends Transport {

    private final int capacity;

    public Track(int maxSpeed, String brand, int fuelConsumption, String uid, int capacity) {
        super(maxSpeed, brand, fuelConsumption, uid);
        this.capacity = capacity;
    }

}
