package org.developx.gof.behavioral_patterns.template_callback.code.calculator;

public class CalculatorTemplate {
    public int calculator(CalculatorCallback callback, int x, int y){
        return callback.operation(x, y);
    }
}
