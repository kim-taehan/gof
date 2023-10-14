package org.developx.gof.creational_patterns.prototype.code.basic;

public class ConcretePrototypeA implements Prototype {

    private final String text;

    @Override
    public String getText() {
        return text;
    }

    public ConcretePrototypeA(String text) {
        this.text = text;
    }

    private ConcretePrototypeA(ConcretePrototypeA concretePrototypeA) {
        this.text = concretePrototypeA.text;
    }
    @Override
    public Prototype clone() {
        return new ConcretePrototypeA(this);
    }

}
