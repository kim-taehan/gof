package org.developx.gof.structural_patterns.proxy.code;

public class RealSubject implements Subject {
    @Override
    public String operation(String comment) {
        return comment;
    }
}
