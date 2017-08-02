package com.patterns.command;

/**
 * Created by sbt-ganiev-ar on 27.07.2017.
 */
public class SimpleRemoteControl {

    Command slot;

    public SimpleRemoteControl() {};

    public void setCommand(Command command) {
        slot = command;
    }

    public void buttonWasPressed() {
        slot.execute();
    }

}
