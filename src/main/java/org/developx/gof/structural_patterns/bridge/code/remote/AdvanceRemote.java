package org.developx.gof.structural_patterns.bridge.code.remote;

import org.developx.gof.structural_patterns.bridge.code.remote.device.Device;

public class AdvanceRemote extends Remote {

    public AdvanceRemote(Device device) {
        super(device);
    }

    public void mute() {
        device.mute();
    }
}
