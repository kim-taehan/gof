package org.developx.gof.behavioral_patterns.chainofresponse.code.basic;

public class ConcreteHandler2 implements Handler {

    private final Handler next;
    public ConcreteHandler2(Handler next) {
        this.next = next;
    }

    @Override
    public void handleRequest(String request) {
        next.handleRequest(request);
    }
}
