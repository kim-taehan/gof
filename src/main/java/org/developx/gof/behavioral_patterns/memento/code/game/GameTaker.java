package org.developx.gof.behavioral_patterns.memento.code.game;

public class GameTaker {

    private SaveFile[] saveFiles = new SaveFile[3];

    public void save(GameState gameState, int index) {
        SaveFile save = gameState.save();
        saveFiles[index] = save;
    }

    public void load(GameState gameState, int index) {
        SaveFile saveFile = saveFiles[index];
        if(saveFile == null) throw new IllegalStateException();
        gameState.load(saveFile);
    }
}
