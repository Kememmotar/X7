package com.lessons.junior.n001;

public class Bus extends Transport {

    private final int countSeats;
    private final TypeOfTransportation typeOfTransportation;

    public Bus(int maxSpeed, String brand, int fuelConsumption, String uid, int countSeats, TypeOfTransportation typeOfTransportation) {
        super(maxSpeed, brand, fuelConsumption, uid);
        this.countSeats = countSeats;
        this.typeOfTransportation = typeOfTransportation;
    }

}
