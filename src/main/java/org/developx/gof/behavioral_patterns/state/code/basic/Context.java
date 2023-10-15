package org.developx.gof.behavioral_patterns.state.code.basic;

public class Context {
    private State state;
    public Context(State state) {
        this.state = state;
    }
    public void changeState(State state) {
        this.state = state;
    }
    public void operation() {
        state.operation();
    }
}
