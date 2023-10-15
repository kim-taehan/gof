package org.developx.gof.behavioral_patterns.mediator.code.hotel;

public record Guest(FrontDesk frontDesk, String name, String roomId) {

    public void roomService(String service) {
        System.out.println(String.format("%s 고객님에 %s 서비스가 도착했습니다.", name, service));
    }

    public void dinner() {
        frontDesk.dinner(this);
    }
    public void cleaning() {
        frontDesk.cleaning(this);
    }
}
