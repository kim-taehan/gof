package org.developx.gof.behavioral_patterns.template_method.code.calculator;

public abstract class CalculatorTemplate {
    public int calculator(int x, int y){
        return operation(x, y);
    }
    protected abstract int operation(int x, int y);
}
