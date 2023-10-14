package org.developx.gof.creational_patterns.abstract_factory.code.basic;

public class ConcreteFactory implements AbstractFactory {

    @Override
    public ProductA createProductA() {
        return new ConcreteProductA();
    }
    @Override
    public ProductB createProductB() {
        return new ConcreteProductB();
    }
}
