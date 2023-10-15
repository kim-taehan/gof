package org.developx.gof.behavioral_patterns.template_callback.code;

import org.assertj.core.api.Assertions;
import org.developx.gof.behavioral_patterns.template_callback.code.basic.AbstractClass;
import org.developx.gof.behavioral_patterns.template_callback.code.basic.ConcreteCallback;
import org.developx.gof.behavioral_patterns.template_callback.code.calculator.CalculatorTemplate;
import org.developx.gof.behavioral_patterns.template_callback.code.calculator.PlusCalculatorCallback;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("[행동패턴] template callback pattern")
class TemplateCallbackTest {

    @DisplayName("템플릿 콜백 패턴을 사용한다.")
    @Test
    void templateCallbackTest(){
        // given
        AbstractClass abstractClass = new AbstractClass();
        abstractClass.templateMethod(new ConcreteCallback());
    }

    @DisplayName("템플릿 콜백 패턴을 람다 형태로 사용한다")
    @Test
    void templateCallbackTestForRamda(){
        // given
        AbstractClass abstractClass = new AbstractClass();
        abstractClass.templateMethod(()-> System.out.println("람다로 테스트 수행"));
    }

    @DisplayName("템플릿 콜백 패턴을 플러스 계산기로 계산한다.")
    @Test
    void plusCalculatorCallbackTest(){
        // given
        CalculatorTemplate calculatorTemplate = new CalculatorTemplate();
        int ret = calculatorTemplate.calculator(new PlusCalculatorCallback(), 10, 20);

        Assertions.assertThat(ret).isEqualTo(30);
    }

    @DisplayName("템플릿 콜백 패턴을 곱셰 계산기로 람다로 직접 생성한다.")
    @Test
    void multipleCalculatorCallbackTest(){
        // given
        CalculatorTemplate calculatorTemplate = new CalculatorTemplate();
        int ret = calculatorTemplate.calculator((x, y) -> x * y, 10, 20);

        Assertions.assertThat(ret).isEqualTo(200);
    }
}