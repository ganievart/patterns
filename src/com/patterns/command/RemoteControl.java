package com.patterns.command;

/**
 * Created by sbt-ganiev-ar on 27.07.2017.
 */
public class RemoteControl {

    Command[] onCommands;
    Command[] offCommands;

    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

//        Command noCommand - ne
    }
}
