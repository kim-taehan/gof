package org.developx.gof.creational_patterns.bullder.code.basic;

public interface Builder {
    Builder buildStepA(String text);
    Builder buildStepB(String text);
    Product getProduct();
}
