package com.lessons.junior.n001;

import java.util.Comparator;

public class Transport {

    private final int maxSpeed;
    private final String brand;
    private int fuelConsumption;
    private final String uid;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public String getUid() {
        return uid;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public Transport(int maxSpeed, String brand, int fuelConsumption, String uid) {
        this.maxSpeed = maxSpeed;
        this.brand = brand;
        this.fuelConsumption = fuelConsumption;
        this.uid = uid;
    }

    public static final Comparator<Transport> COMPARE_BY_COUNT = new Comparator<Transport>() {
        @Override
        public int compare(Transport lhs, Transport rhs) {
            return lhs.getMaxSpeed() - rhs.getMaxSpeed();
        }
    };



}
