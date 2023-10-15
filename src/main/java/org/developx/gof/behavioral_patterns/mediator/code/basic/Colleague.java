package org.developx.gof.behavioral_patterns.mediator.code.basic;

public abstract class Colleague {

    private final Mediator mediator;
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }

    public String call() {
        return mediator.mediate(this);
    }

    protected abstract String getName();
}
