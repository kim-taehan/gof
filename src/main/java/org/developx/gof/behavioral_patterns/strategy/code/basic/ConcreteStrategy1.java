package org.developx.gof.behavioral_patterns.strategy.code.basic;

public class ConcreteStrategy1 implements Strategy {
    @Override
    public void execute() {
        System.out.println("ConcreteStrategy2 call");
    }
}
