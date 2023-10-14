package org.developx.gof.structural_patterns.bridge.code.basic;

public class ConcreteImplementation implements Implementation {
    @Override
    public String method() {
        return "기본기능";
    }
}
