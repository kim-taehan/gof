package org.developx.gof.behavioral_patterns.template_callback.code.basic;


public class AbstractClass {
    public void templateMethod(Callback callback) {
        step1();
        callback.operation();
        step2();
    }
    private void step1() {

    }
    private void step2() {

    }
}
