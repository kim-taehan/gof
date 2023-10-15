package org.developx.gof.behavioral_patterns.strategy.code.football.strategy;

import org.developx.gof.behavioral_patterns.strategy.code.football.Formation;

public class DefenseStrategy implements Strategy {

    private static final Formation formation = new Formation(5, 4, 1);
    @Override
    public Formation operation() {
        return formation;
    }
}
