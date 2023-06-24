package net.noit1915.basepatterns.structural.bridge.remotes;

import net.noit1915.basepatterns.structural.bridge.devices.Device;

public class AdvancedRemote extends BasicRemote{

    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
