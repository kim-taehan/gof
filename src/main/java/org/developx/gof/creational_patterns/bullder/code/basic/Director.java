package org.developx.gof.creational_patterns.bullder.code.basic;

public class Director {
    private final Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }
    public Product construct() {
        return builder
                .buildStepA("itemA")
                .buildStepB("itemB")
                .getProduct();
    }
}
