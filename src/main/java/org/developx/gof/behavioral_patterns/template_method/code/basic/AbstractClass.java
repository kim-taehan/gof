package org.developx.gof.behavioral_patterns.template_method.code.basic;

import org.developx.gof.structural_patterns.flyweight.font.Color;

public abstract class AbstractClass {

    public void templateMethod() {
        step1();
        step2();
    }
    abstract void step1();
    abstract void step2();
}
