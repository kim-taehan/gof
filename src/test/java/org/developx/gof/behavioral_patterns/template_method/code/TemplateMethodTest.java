package org.developx.gof.behavioral_patterns.template_method.code;

import org.assertj.core.api.Assertions;
import org.developx.gof.behavioral_patterns.template_method.code.basic.ConcreteClass;
import org.developx.gof.behavioral_patterns.template_method.code.calculator.CalculatorTemplate;
import org.developx.gof.behavioral_patterns.template_method.code.calculator.MinusCalculator;
import org.developx.gof.behavioral_patterns.template_method.code.calculator.PlusCalculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
@DisplayName("[행동패턴] template method pattern")
class TemplateMethodTest {

    @DisplayName("템플릿 메서드 패턴을 사용한다.")
    @Test
    void templateMethodTest(){
        // given
        ConcreteClass concreteClass = new ConcreteClass();
        concreteClass.templateMethod();
    }

    @DisplayName("Calulator 템플릿 기능을 확인한다")
    @Test
    void calculatorTest(){
        // given
        CalculatorTemplate plusCalculator = new PlusCalculator();
        CalculatorTemplate minusCalculator = new MinusCalculator();

        // when
        // then
        Assertions.assertThat(plusCalculator.calculator(20, 10)).isEqualTo(30);
        Assertions.assertThat(minusCalculator.calculator(20, 10)).isEqualTo(10);
    }


}