package org.developx.gof.behavioral_patterns.interpreter.code.expression;

public class NonTerminalExpression implements Expression {
    private final char value;
    public NonTerminalExpression(char value) {
        this.value = value;
    }
    @Override
    public int interpret(Context context) {
        return context.mapper.get(value);
    }
}
