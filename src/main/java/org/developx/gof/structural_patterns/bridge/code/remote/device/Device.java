package org.developx.gof.structural_patterns.bridge.code.remote.device;

public abstract class Device {

    protected int vol;
    protected Device(int vol) {
        this.vol = vol;
    }

    public int getVol() {
        return vol;
    }

    public void volUp() {
        vol++;
    }
    public void volDown() {
        vol--;
    }
    public void mute() {
        throw new IllegalArgumentException("제공하지 않는 기능입니다.");
    }
}
