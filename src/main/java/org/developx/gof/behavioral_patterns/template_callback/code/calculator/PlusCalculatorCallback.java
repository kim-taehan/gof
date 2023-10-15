package org.developx.gof.behavioral_patterns.template_callback.code.calculator;

public class PlusCalculatorCallback implements CalculatorCallback {
    @Override
    public int operation(int x, int y) {
        return x + y;
    }
}
