package org.developx.gof.behavioral_patterns.interpreter.code.expression;

public class TerminalExpression implements Expression {
    private final Expression left;
    private final Expression right;
    public TerminalExpression(Expression left, Expression right) {
        this.left = left;
        this.right = right;
    }
    @Override
    public int interpret(Context context) {
        return left.interpret(context) * right.interpret(context);
    }
}
