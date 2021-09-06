package com.lessons.junior.n001;

import java.util.List;

public class ReportMaxSpeed {

    private final int maxSpeed;

    public ReportMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public void report(List<Transport> transports) {
        for (Transport transport : transports) {
            if (transport.getMaxSpeed() > maxSpeed)
                System.out.println(transport.getBrand());
        }
    }
}
