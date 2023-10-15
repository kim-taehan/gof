package org.developx.gof.behavioral_patterns.memento.code.game;

public class GameState {
    private int stage;
    private int hp;
    private int mp;

    public GameState(int stage, int hp, int mp) {
        this.stage = stage;
        this.hp = hp;
        this.mp = mp;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public SaveFile save() {
        return new SaveFile(stage, hp, mp);
    }

    public void load(SaveFile saveFile) {
        this.stage = saveFile.stage();
        this.hp = saveFile.hp();
        this.mp = saveFile.mp();
    }
}
