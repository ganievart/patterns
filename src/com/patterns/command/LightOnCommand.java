package com.patterns.command;

/**
 * Created by sbt-ganiev-ar on 27.07.2017.
 */
public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
