package org.developx.gof.behavioral_patterns.command.code.basic;

public class Invoker {
    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }
    public void executeCommand() {
        command.execute();
    }
}
