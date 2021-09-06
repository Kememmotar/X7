package com.lessons.junior.n001;

import java.util.ArrayList;
import java.util.List;

public class Autopark {

    private List<Transport> transports = new ArrayList<Transport>();

    public void addTransport(Transport transport) {
        transports.add(transport);
    }

    public List<Transport> getTransports() {
        return transports;
    }

}
