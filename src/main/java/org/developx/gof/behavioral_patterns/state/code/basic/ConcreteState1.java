package org.developx.gof.behavioral_patterns.state.code.basic;

public class ConcreteState1 implements State{
    @Override
    public void operation() {
        System.out.println("ConcreteState1 call");
    }
}
