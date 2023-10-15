package org.developx.gof.behavioral_patterns.mediator.code.basic;

public class ColleagueB extends Colleague {

    private final String name = "ColleagueB";
    public ColleagueB(Mediator mediator) {
        super(mediator);
    }
    @Override
    public String getName() {
        return name;
    }

}
