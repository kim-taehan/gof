package org.developx.gof.structural_patterns.decorator.code.basic.decorator;

import org.developx.gof.structural_patterns.decorator.code.basic.Component;


public class ConcreteDecorator2 extends Decorator {

    public ConcreteDecorator2(Component wrappee) {
        super(wrappee);
    }

    @Override
    public String operation(String text) {
        return wrappee.operation(trim(text));
    }

    private String trim(String text) {
        return text.trim();
    }
}
