package org.developx.gof.behavioral_patterns.command.code;

import org.assertj.core.api.Assertions;
import org.developx.gof.behavioral_patterns.command.code.basic.ConcreteCommand;
import org.developx.gof.behavioral_patterns.command.code.basic.Invoker;
import org.developx.gof.behavioral_patterns.command.code.cook.Coffee;
import org.developx.gof.behavioral_patterns.command.code.cook.Kiosk;
import org.developx.gof.behavioral_patterns.command.code.cook.order.AmericanoOrder;
import org.developx.gof.behavioral_patterns.command.code.cook.order.LatteOrder;
import org.developx.gof.behavioral_patterns.command.code.cook.order.Order;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("[행동패턴] command pattern")
class CommandTest {
    @DisplayName("command pattern 기본 형태를 확인한다")
    @Test
    void commandTest(){
        // given
        Invoker invoker = new Invoker();
        invoker.setCommand(new ConcreteCommand());
        invoker.executeCommand();
    }

    @DisplayName("command pattern 기본 형태를 람다 형태로 구현")
    @Test
    void commandTestOfRamda(){
        // given
        Invoker invoker = new Invoker();
        invoker.setCommand(() -> System.out.println("Hello Command"));
        invoker.executeCommand();
    }
    
    @DisplayName("키오스크로 아이스아메리카노를 주문한다.")
    @Test
    void takeOrderAmericano(){
        // given
        Order order = new AmericanoOrder();
        Kiosk kiosk = new Kiosk();
        kiosk.setOrder(order);

        // when
        Coffee coffee = kiosk.takeOrder();
        
        // then
        Assertions.assertThat(coffee).isEqualTo(Coffee.AMERICANO);
    }

    @DisplayName("키오스크로 라떼를 주문한다.")
    @Test
    void takeOrderLatte(){
        // given
        Order order = new LatteOrder();
        Kiosk kiosk = new Kiosk();
        kiosk.setOrder(order);

        // when
        Coffee coffee = kiosk.takeOrder();

        // then
        Assertions.assertThat(coffee).isEqualTo(Coffee.LATTE);
    }
    

}