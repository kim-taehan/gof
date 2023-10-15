package org.developx.gof.behavioral_patterns.chainofresponse.code.basic;

public class ConcreteHandler1 implements Handler {

    private final Handler next;
    public ConcreteHandler1(Handler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(String request) {
        next.handleRequest(request);
    }
}
