package org.developx.gof.structural_patterns.decorator.code.basic;

public class ConcreteComponent implements Component {
    @Override
    public String operation(String text) {
        return text;
    }
}
