package org.developx.gof.behavioral_patterns.command.code.basic;

public class ConcreteCommand implements Command {
    @Override
    public void execute() {
        Receiver receiver = new Receiver();
        receiver.run();
    }
}
