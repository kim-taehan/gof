package org.developx.gof.behavioral_patterns.memento.code.basic;

import java.util.Stack;

public class CareTaker {
    private final Originator originator;
    private Stack<Memento> history = new Stack<>();
    public CareTaker(Originator originator) {
        this.originator = originator;
    }
    public void undo() {
        if (history.size() == 0) {
            throw new NullPointerException();
        }
        originator.restore(history.pop());
    }
    public void doSomething() {
        history.push(originator.save());
    }
}
