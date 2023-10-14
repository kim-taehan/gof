package org.developx.gof.structural_patterns.adapter.code.basic;

public class Adapter implements Target {
    @Override
    public void operation() {
        Adaptee adaptee = new Adaptee();
        adaptee.specificOperation();
    }
}
