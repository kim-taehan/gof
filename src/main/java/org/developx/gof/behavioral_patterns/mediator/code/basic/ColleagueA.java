package org.developx.gof.behavioral_patterns.mediator.code.basic;

public class ColleagueA extends Colleague {

    private final String name = "ColleagueA";

    public ColleagueA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public String getName() {
        return name;
    }
}
