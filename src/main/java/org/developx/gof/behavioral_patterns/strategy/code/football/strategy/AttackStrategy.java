package org.developx.gof.behavioral_patterns.strategy.code.football.strategy;

import org.developx.gof.behavioral_patterns.strategy.code.football.Formation;

public class AttackStrategy implements Strategy {

    private static final Formation formation = new Formation(4, 4, 2);
    @Override
    public Formation operation() {
        return formation;
    }
}
