package org.developx.gof.behavioral_patterns.mediator.code.basic;

public class ConcreteMediator implements Mediator {

    private Colleague colleagueA;
    private Colleague colleagueB;

    public void setColleagues(Colleague colleagueA, Colleague colleagueB) {
        this.colleagueA = colleagueA;
        this.colleagueB = colleagueB;
    }
    @Override
    public String mediate(Colleague self) {
        String comment = self == colleagueA ? colleagueB.getName() : colleagueA.getName();
        return "hello " + comment;
    }
}
