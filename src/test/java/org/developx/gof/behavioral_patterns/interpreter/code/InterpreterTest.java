package org.developx.gof.behavioral_patterns.interpreter.code;

import org.developx.gof.behavioral_patterns.interpreter.code.expression.Context;
import org.developx.gof.behavioral_patterns.interpreter.code.expression.Expression;
import org.developx.gof.behavioral_patterns.interpreter.code.expression.NonTerminalExpression;
import org.developx.gof.behavioral_patterns.interpreter.code.expression.TerminalExpression;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("[행동패턴] interpreter pattern")
class InterpreterTest {

    @DisplayName("인터프리터 방식으로 간단한 X * Y를 계산한다.")
    @Test
    void InterpreterTest1(){
        // given
        Context context = new Context(Map.of('x', 111, 'y', 222));
        Expression expression = parseInterpreter();

        // when
        int interpret = expression.interpret(context);

        // then
        assertThat(interpret).isEqualTo(24642);
    }

    private static TerminalExpression parseInterpreter() {
        return new TerminalExpression(new NonTerminalExpression('x'), new NonTerminalExpression('y'));
    }

    @DisplayName("인터프리터 방식으로 간단한 X * Y * X를 계산한다.")
    @Test
    void InterpreterTest2(){
        // given
        Context context = new Context(Map.of('x', 111, 'y', 222));
        Expression expression =  new TerminalExpression(
                new NonTerminalExpression('x'),
                new TerminalExpression(
                        new NonTerminalExpression('x'),
                        new NonTerminalExpression('y')
                )
        );

        // when
        int interpret = expression.interpret(context);

        // then
        assertThat(interpret).isEqualTo(2735262);
    }


}