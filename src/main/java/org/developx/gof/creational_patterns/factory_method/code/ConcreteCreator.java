package org.developx.gof.creational_patterns.factory_method.code;

public class ConcreteCreator extends Creator {

    @Override
    protected Product createProduct() {
        return new ConcreteProduct();
    }
}
