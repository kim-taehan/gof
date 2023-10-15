package org.developx.gof.behavioral_patterns.mediator.code.hotel.service;

import org.developx.gof.behavioral_patterns.mediator.code.hotel.FrontDesk;
import org.developx.gof.behavioral_patterns.mediator.code.hotel.Guest;

public class Restaurant implements Service {

    private final FrontDesk frontDesk;
    public Restaurant(FrontDesk frontDesk) {
        this.frontDesk = frontDesk;
        frontDesk.openService(this);
    }

    @Override
    public boolean support(ServiceType serviceType) {
        return serviceType == ServiceType.DINNER;
    }

    @Override
    public void requestDinner(Guest guest) {
        guest.roomService(ServiceType.DINNER.name());
    }
}
