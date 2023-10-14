package org.developx.gof.creational_patterns.prototype.code.basic;

public class ConcretePrototypeB implements Prototype {

    private final String text;

    @Override
    public String getText() {
        return text;
    }

    public ConcretePrototypeB(String text) {
        this.text = text;
    }

    private ConcretePrototypeB(ConcretePrototypeB concretePrototypeA) {
        this.text = concretePrototypeA.text;
    }
    @Override
    public Prototype clone() {
        return new ConcretePrototypeB(this);
    }
}
