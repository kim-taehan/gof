package org.developx.gof.behavioral_patterns.strategy.code.football;

import org.developx.gof.behavioral_patterns.strategy.code.football.strategy.Strategy;

public class Game {
    private Strategy strategy;
    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public Formation operation() {
        return strategy.operation();
    }
}
