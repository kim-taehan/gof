package org.developx.gof.behavioral_patterns.template_callback.code.basic;


public class ConcreteCallback implements Callback {
    @Override
    public void operation() {
        System.out.println("ConcreteCallback call");
    }
}
