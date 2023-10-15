package org.developx.gof.behavioral_patterns.template_method.code.basic;

public class ConcreteClass extends AbstractClass {
    @Override
    void step1() {
        System.out.println("step1 call");
    }
    @Override
    void step2() {
        System.out.println("step2 call");
    }
}
