package org.developx.gof.creational_patterns.bullder.code.basic;

public class ConcreteBuilder implements Builder {
    private String itemA, itemB;
    @Override
    public Builder buildStepA(String text) {
        this.itemA = text;
        return this;
    }
    @Override
    public Builder buildStepB(String text) {
        this.itemB = text;
        return this;
    }
    @Override
    public Product getProduct() {
        return new Product(this.itemA, this.itemB);
    }
}
