package org.developx.gof.behavioral_patterns.memento.code;

import org.assertj.core.api.Assertions;
import org.developx.gof.behavioral_patterns.memento.code.basic.Memento;
import org.developx.gof.behavioral_patterns.memento.code.basic.Originator;
import org.developx.gof.behavioral_patterns.memento.code.game.GameState;
import org.developx.gof.behavioral_patterns.memento.code.game.GameTaker;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MementoTest {

    @DisplayName("메멘토패턴을 동해 변경상황을 복구해본다.")
    @Test
    void MementoTest(){
        // given

        Originator originator = new Originator();
        originator.setState("hello memento");
        Memento saveFile = originator.save();

        // when
        originator.setState("goodbye memento");
        originator.restore(saveFile);

        // then
        Assertions.assertThat(originator.getState()).isEqualTo("hello memento");
    }

    @DisplayName("게임 상태를 원한는 곳으로 변경할 수 있다.")
    @Test
    void gameSaveTest(){
        // given
        GameTaker gameTaker = new GameTaker();

        GameState gameState = new GameState(0, 100, 100);
        // 최초 상태를 저장합니다.
        gameTaker.save(gameState, 0);

        gameState.setStage(10);
        gameState.setHp(40);
        gameState.setMp(150);

        gameTaker.save(gameState, 1);

        gameState.setStage(20);
        gameState.setHp(10);
        gameState.setMp(10);


        // when
        gameTaker.load(gameState, 1);

        // then
        Assertions.assertThat(gameState).extracting("stage", "hp", "mp").contains(10, 40, 150);
    }


}