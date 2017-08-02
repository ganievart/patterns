package com.patterns.command;

/**
 * Created by sbt-ganiev-ar on 27.07.2017.
 */
public class GarageDoorOpenCommand implements Command {

    GarageDoorOpen garageDoorOpen;

    public GarageDoorOpenCommand(GarageDoorOpen garageDoorOpen) {
        this.garageDoorOpen = garageDoorOpen;
    }

    @Override
    public void execute() {
        garageDoorOpen.up();
    }
}
