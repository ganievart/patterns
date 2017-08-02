package com.patterns.command;

/**
 * Created by sbt-ganiev-ar on 27.07.2017.
 */
public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        GarageDoorOpenCommand garageUp = new GarageDoorOpenCommand(new GarageDoorOpen());

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

        remote.setCommand(garageUp);
        remote.buttonWasPressed();
    }
}
