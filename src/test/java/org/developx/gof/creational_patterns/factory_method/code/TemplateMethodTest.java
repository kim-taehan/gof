package org.developx.gof.creational_patterns.factory_method.code;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

@DisplayName("[생성패턴] template method")
class TemplateMethodTest {

    @DisplayName("template method pattern 으로 생성한다.")
    @Test
    void templateMethodTest(){
        // given
        Creator creator = new ConcreteCreator();

        // when
        Product order = creator.create();

        // then
        assertThat(order).isInstanceOf(ConcreteProduct.class);
    }
}