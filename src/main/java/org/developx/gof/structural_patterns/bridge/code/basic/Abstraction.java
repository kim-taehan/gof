package org.developx.gof.structural_patterns.bridge.code.basic;

public class Abstraction {

    private final Implementation implementation;
    public Abstraction(Implementation implementation) {
        this.implementation = implementation;
    }
    public String operation(){
        return implementation.method();
    }
}
