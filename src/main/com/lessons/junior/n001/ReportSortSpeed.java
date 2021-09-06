package com.lessons.junior.n001;

import java.util.*;

public class ReportSortSpeed {

    public void report(List<Transport> transports) {
        List<Transport> tempTransports = new ArrayList<>();
        tempTransports.addAll(transports);

        Collections.sort(tempTransports, Transport.COMPARE_BY_COUNT);

        for (Transport transport : tempTransports) {
            System.out.println(transport.getBrand());
        }
    }

}
