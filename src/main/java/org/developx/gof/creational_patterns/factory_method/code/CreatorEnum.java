package org.developx.gof.creational_patterns.factory_method.code;

public enum CreatorEnum {

    Product {
        protected Product createProduct() {
            return new ConcreteProduct();
        }
    },
    ProductNull {
        protected Product createProduct() {
            return null;
        }
    };

    public Product create() {
        templateMethod(); // 공통의 사전작업
        return createProduct();
    }

    abstract protected Product createProduct();

    private void templateMethod(){
        // 공통으로 수행되는 작업
    }
}
