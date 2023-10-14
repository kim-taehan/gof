package org.developx.gof.structural_patterns.composite.code.basic;

import java.util.Arrays;

public class Composite implements Component {

    private final Component[] children;
    public Composite(Component[] children) {
        this.children = children;
    }
    @Override
    public void operation() {
        System.out.println("Hello Composite!!");
        Arrays.stream(children).forEach(Component::operation);
    }
}
