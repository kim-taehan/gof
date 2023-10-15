package org.developx.gof.behavioral_patterns.template_method.code.calculator;

public class PlusCalculator extends CalculatorTemplate {
    @Override
    public int operation(int x, int y) {
        return x + y;
    }
}
