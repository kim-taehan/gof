package org.developx.gof.structural_patterns.bridge.code.basic;

public class RefinedAbstraction extends Abstraction{
    public RefinedAbstraction(Implementation implementation) {
        super(implementation);
    }

    @Override
    public String operation() {
        return super.operation() + "|추가기능";
    }
}
