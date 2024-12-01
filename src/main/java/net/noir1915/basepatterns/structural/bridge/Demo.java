package net.noir1915.basepatterns.structural.bridge;

import net.noir1915.basepatterns.structural.bridge.devices.Device;
import net.noir1915.basepatterns.structural.bridge.devices.Radio;
import net.noir1915.basepatterns.structural.bridge.devices.Tv;
import net.noir1915.basepatterns.structural.bridge.remotes.AdvancedRemote;
import net.noir1915.basepatterns.structural.bridge.remotes.BasicRemote;

public class Demo {

    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    private static void testDevice(Device device) {
        System.out.println("Tests with basic remote");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
