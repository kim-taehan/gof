package org.developx.gof.behavioral_patterns.observer.code;

import org.assertj.core.api.Assertions;
import org.developx.gof.behavioral_patterns.observer.code.basic.ConcreteObserver;
import org.developx.gof.behavioral_patterns.observer.code.basic.Observer;
import org.developx.gof.behavioral_patterns.observer.code.basic.Subject;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("[행동패턴] observer pattern")
class ObserverTest {

    @DisplayName("코스피 지수를 구독시 변경사항을 기록한다.")
    @Test
    void test(){
        // given
        Subject subject = new Subject();
        Observer observer1 = new ConcreteObserver();
        Observer observer2 = new ConcreteObserver();

        // when 
        // observer1, observer2 구독
        subject.subscribe(observer1);
        subject.subscribe(observer2);

        // kospi 200으로 변경
        subject.notify2(200);

        // observer2 구독 해제
        subject.unsubscribe(observer2);

        // kospi 300으로 변경
        subject.notify2(300);


        // then
        Assertions.assertThat(observer1.getKospi()).isEqualTo(300);
        Assertions.assertThat(observer2.getKospi()).isEqualTo(200);
    }


}