package org.developx.gof.behavioral_patterns.mediator.code.hotel.service;

import org.developx.gof.behavioral_patterns.mediator.code.hotel.Guest;

public interface Service {


    boolean support(ServiceType facilityType);

    default void requestCleaning(Guest guest){
        throw new IllegalStateException("지원하지 않는 서비스입니다.");
    }

    default void requestDinner(Guest guest) {
        throw new IllegalStateException("지원하지 않는 서비스입니다.");
    }
}
