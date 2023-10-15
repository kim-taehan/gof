package org.developx.gof.behavioral_patterns.mediator.code;

import org.assertj.core.api.Assertions;
import org.developx.gof.behavioral_patterns.mediator.code.basic.Colleague;
import org.developx.gof.behavioral_patterns.mediator.code.basic.ColleagueA;
import org.developx.gof.behavioral_patterns.mediator.code.basic.ColleagueB;
import org.developx.gof.behavioral_patterns.mediator.code.basic.ConcreteMediator;
import org.developx.gof.behavioral_patterns.mediator.code.hotel.FrontDesk;
import org.developx.gof.behavioral_patterns.mediator.code.hotel.Guest;
import org.developx.gof.behavioral_patterns.mediator.code.hotel.service.CleaningService;
import org.developx.gof.behavioral_patterns.mediator.code.hotel.service.Restaurant;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("[행동패턴] mediator pattern")
class MediatorTest {

    @DisplayName("중재자 패턴으로 동료들끼리 인사를 주고 받는다.")
    @Test
    void test(){
        // given
        ConcreteMediator mediator = new ConcreteMediator();
        Colleague colleagueA = new ColleagueA(mediator);
        Colleague colleagueB = new ColleagueB(mediator);

        mediator.setColleagues(colleagueA, colleagueB);

        // when
        String comment = colleagueA.call();

        // then
        Assertions.assertThat(comment).isEqualTo("hello ColleagueB");
    }

    @DisplayName("호텔에 체크인하여 룸서비스를 이용할 수 있다.")
    @Test
    void hotelServiceTest(){
        // given
        FrontDesk frontDesk = new FrontDesk();
        new CleaningService(frontDesk);
        new Restaurant(frontDesk);

        Guest 홍길동 = frontDesk.checkIn("홍길동");
        Guest 류관순 = frontDesk.checkIn("류관순");

        // when
        홍길동.cleaning();
        류관순.dinner();

        // then
        Assertions.assertThat("");
    }



}