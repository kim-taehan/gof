package org.developx.gof.structural_patterns.decorator.code;

import org.assertj.core.api.Assertions;
import org.developx.gof.structural_patterns.decorator.code.basic.Component;
import org.developx.gof.structural_patterns.decorator.code.basic.ConcreteComponent;
import org.developx.gof.structural_patterns.decorator.code.basic.decorator.ConcreteDecorator1;
import org.developx.gof.structural_patterns.decorator.code.basic.decorator.ConcreteDecorator2;
import org.developx.gof.structural_patterns.decorator.code.basic.decorator.Decorator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("[구조패턴] decorator pattern")
class DecoratorTest {
    
    @DisplayName("decorator 으로 trim, 소문자 변경하여 데이터를 추출한다.")
    @Test
    void test(){
        // given
        Component component = new ConcreteComponent();
        Decorator decorator2 = new ConcreteDecorator2(component);
        Decorator decorator1 = new ConcreteDecorator1(decorator2);

        // when
        String ret = decorator1.operation(" Hello KimTaeHan ");

        // then
        Assertions.assertThat(ret).isEqualTo("hello kimtaehan");
    }
    
}