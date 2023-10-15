package org.developx.gof.behavioral_patterns.state.code;

import org.assertj.core.api.Assertions;
import org.developx.gof.behavioral_patterns.state.code.atm.AtmService;
import org.developx.gof.behavioral_patterns.state.code.basic.ConcreteState1;
import org.developx.gof.behavioral_patterns.state.code.basic.ConcreteState2;
import org.developx.gof.behavioral_patterns.state.code.basic.Context;
import org.developx.gof.behavioral_patterns.state.code.basic.State;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("[행동패턴] state pattern")
class StateTest {
    @DisplayName("상태 패턴으로 행동을 관리한다.")
    @Test
    void statePatternTest(){
        // given
        State state1 = new ConcreteState1();
        State state2 = new ConcreteState2();

        Context context = new Context(state1);
        context.operation();

        context.changeState(state2);
        context.operation();
        // when

        // then
        Assertions.assertThat("");
    }
    
    @DisplayName("ATM 상태가 정상인 경우 잔액조회 및 인출이 가능하다.")
    @Test
    void normalTest(){
        // given
        Map<String, Integer> allBalance = new HashMap<>();
        allBalance.put("kim", 100);
        allBalance.put("lee", 100);

        AtmService atmService = new AtmService(allBalance);
        atmService.startAtm();

        // when
        // then
        int withdraw = atmService.withdraw("kim", 30);
        Assertions.assertThat(withdraw).isEqualTo(30);

        int balance = atmService.balance("kim");
        Assertions.assertThat(balance).isEqualTo(70);
    }

    @DisplayName("ATM 상태가 점검 경우 잔액조회 만 가능하다.")
    @Test
    void inspectionTest(){
        // given
        Map<String, Integer> allBalance = new HashMap<>();
        allBalance.put("kim", 100);
        allBalance.put("lee", 100);

        AtmService atmService = new AtmService(allBalance);
        atmService.startInspection();

        // when
        // then
        Assertions.assertThatThrownBy(() ->  atmService.withdraw("kim", 30))
                .isInstanceOf(IllegalStateException.class);

        int balance = atmService.balance("kim");
        Assertions.assertThat(balance).isEqualTo(100);
    }

    @DisplayName("ATM 상태가 종료인 경우 전부 불가하다.")
    @Test
    void StopTest(){
        // given
        Map<String, Integer> allBalance = new HashMap<>();
        allBalance.put("kim", 100);
        allBalance.put("lee", 100);

        AtmService atmService = new AtmService(allBalance);

        // when
        // then
        Assertions.assertThatThrownBy(() ->  atmService.withdraw("kim", 30))
                .isInstanceOf(IllegalStateException.class);
        Assertions.assertThatThrownBy(() ->  atmService.balance("kim"))
                .isInstanceOf(IllegalStateException.class);


    }

}