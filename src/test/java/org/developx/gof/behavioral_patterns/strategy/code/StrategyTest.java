package org.developx.gof.behavioral_patterns.strategy.code;

import org.assertj.core.api.Assertions;
import org.developx.gof.behavioral_patterns.strategy.code.basic.ConcreteStrategy1;
import org.developx.gof.behavioral_patterns.strategy.code.basic.Context;
import org.developx.gof.behavioral_patterns.strategy.code.football.Formation;
import org.developx.gof.behavioral_patterns.strategy.code.football.Game;
import org.developx.gof.behavioral_patterns.strategy.code.football.strategy.AttackStrategy;
import org.developx.gof.behavioral_patterns.strategy.code.football.strategy.DefenseStrategy;
import org.developx.gof.behavioral_patterns.strategy.code.football.strategy.Strategy;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("[행동패턴] strategy pattern")
class StrategyTest {
    @DisplayName("전략 패턴으로 테스트를 수행한다.")
    @Test
    void strategyTest(){
        Context context = new Context(new ConcreteStrategy1());
        context.operation();
    }

    @DisplayName("공격형 포메이션은 4-4-2이다")
    @Test
    void footballTest(){
        // given
        Strategy attackStrategy = new AttackStrategy();

        Game game = new Game();
        game.setStrategy(attackStrategy);
        Formation formation = game.operation();

        // when

        // then
        Assertions.assertThat(formation)
                .extracting("defense","middle","attack")
                .contains(4,4,2);
    }
    @DisplayName("수비형 포메이션은 5-4-1이다")
    @Test
    void footballTestDefense(){
        // given
        Strategy defenseStrategy = new DefenseStrategy();

        Game game = new Game();
        game.setStrategy(defenseStrategy);
        Formation formation = game.operation();

        // when

        // then
        Assertions.assertThat(formation)
                .extracting("defense","middle","attack")
                .contains(5,4,1);
    }
}