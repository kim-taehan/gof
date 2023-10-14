package org.developx.gof.structural_patterns.decorator.code.basic.decorator;

import org.developx.gof.structural_patterns.decorator.code.basic.Component;

import java.util.Locale;


public class ConcreteDecorator1 extends Decorator {

    public ConcreteDecorator1(Component wrappee) {
        super(wrappee);
    }

    @Override
    public String operation(String text) {
        return wrappee.operation(toLowerCase(text));
    }

    private String toLowerCase(String text) {
        return text.toLowerCase(Locale.ROOT);
    }

}
