package org.developx.gof.behavioral_patterns.interator.code;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("[행동패턴] interator pattern")
class InteratorTest {

    @DisplayName("이터레이터 패턴을 사용하여 순회하는 방법을 제공한다.")
    @Test
    void test(){
        // given
        ConcreteAggregate<String> concreteAggregate = new ConcreteAggregate<>();
        concreteAggregate.add("봄");
        concreteAggregate.add("여름");
        concreteAggregate.add("가을");
        concreteAggregate.add("겨울");

        // when
        Iterator iterator = concreteAggregate.iterator();
        iterator.forEachRemaining(text->{
            System.out.println(text);
        });
    }


}