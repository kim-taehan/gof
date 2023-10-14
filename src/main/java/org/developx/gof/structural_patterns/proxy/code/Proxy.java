package org.developx.gof.structural_patterns.proxy.code;

public class Proxy implements Subject {

    private final Subject subject;
    public Proxy(Subject subject) {
        this.subject = subject;
    }

    // trim 기능
    @Override
    public String operation(String comment) {
        return subject.operation(comment.trim());
    }
}
