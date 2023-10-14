package org.developx.gof.structural_patterns.bridge.code.remote.device;

public class Tv extends Device {
    public Tv(int vol) {
        super(vol);
    }

    @Override
    public void mute() {
        super.vol = 0;
    }
}
