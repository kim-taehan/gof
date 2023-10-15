package org.developx.gof.behavioral_patterns.strategy.code.basic;

public class Context {
    private final Strategy strategy;
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    public void operation() {
        strategy.execute();
    }
}
