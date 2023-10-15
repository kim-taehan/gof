package org.developx.gof.behavioral_patterns.mediator.code.hotel;


import org.developx.gof.behavioral_patterns.mediator.code.hotel.service.Service;
import org.developx.gof.behavioral_patterns.mediator.code.hotel.service.ServiceType;

import java.util.*;

public class FrontDesk {
    List<Guest> guests = new ArrayList<>();
    List<Service> services = new ArrayList<>();

    public Guest checkIn(String name) {
        Guest guest = new Guest(this, name, createRoomId());
        guests.add(guest);
        return guest;
    }

    public void checkOut(Guest guest) {
        guests.remove(guest);
    }

    public void dinner(Guest guest) {
        orderService(ServiceType.DINNER).requestDinner(guest);;
    }

    public void cleaning(Guest guest) {
        orderService(ServiceType.CLEANING).requestCleaning(guest);
    }

    private Service orderService(ServiceType serviceType) {
        return services.stream()
                .filter(service -> service.support(serviceType))
                .findFirst()
                .orElseThrow(() -> new IllegalStateException());

    }

    private static String createRoomId() {
        return UUID.randomUUID().toString().substring(10);
    }

    public void openService(Service service) {
        services.add(service);
    }
}
