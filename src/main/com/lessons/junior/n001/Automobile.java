package com.lessons.junior.n001;

public class Automobile extends Transport{

    private final int countSeats;
    private final SegmentTaxi segmentTaxi;

    public Automobile(int maxSpeed, String brand, int fuelConsumption, String uid, int countSeats, SegmentTaxi segmentTaxi) {
        super(maxSpeed, brand, fuelConsumption, uid);
        this.countSeats = countSeats;
        this.segmentTaxi = segmentTaxi;
    }

}
