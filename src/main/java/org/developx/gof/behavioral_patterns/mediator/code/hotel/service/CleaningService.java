package org.developx.gof.behavioral_patterns.mediator.code.hotel.service;

import org.developx.gof.behavioral_patterns.mediator.code.hotel.FrontDesk;
import org.developx.gof.behavioral_patterns.mediator.code.hotel.Guest;

public class CleaningService implements Service {

    private final FrontDesk frontDesk;
    public CleaningService(FrontDesk frontDesk) {
        this.frontDesk = frontDesk;
        frontDesk.openService(this);
    }

    @Override
    public boolean support(ServiceType serviceType) {
        return serviceType == ServiceType.CLEANING;
    }

    @Override
    public void requestCleaning(Guest guest) {
        guest.roomService(ServiceType.CLEANING.name());
    }
}
