package org.developx.gof.creational_patterns.factory_method.code;

public abstract class Creator {
    private void templateMethod(){
        // 공통으로 수행되는 작업
    }
    public Product create(){
        this.templateMethod();
        return createProduct();
    }

    protected abstract Product createProduct();
}
