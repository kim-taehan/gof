package org.developx.gof.structural_patterns.bridge.code.remote;

import org.developx.gof.structural_patterns.bridge.code.remote.device.Device;

public class Remote {
    protected final Device device;

    public Remote(Device device) {
        this.device = device;
    }

    public void volDown(){
        device.volDown();
    }

    public void volUp(){
        device.volUp();
    }

    public int getVol() {
        return device.getVol();
    }
}
