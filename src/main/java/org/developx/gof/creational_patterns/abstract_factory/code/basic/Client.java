package org.developx.gof.creational_patterns.abstract_factory.code.basic;

public class Client {

    private final AbstractFactory factory;
    private ProductA productA;
    private ProductB productB;
    public Client(AbstractFactory factory) {
        this.factory = factory;
    }

    public void createProducts() {
        this.productA = factory.createProductA();
        this.productB = factory.createProductB();
    }

    public ProductA getProductA() {
        return productA;
    }

    public ProductB getProductB() {
        return productB;
    }
}
