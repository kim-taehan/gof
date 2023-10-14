package org.developx.gof.structural_patterns.composite.code.basic;

public class Leaf implements Component {
    @Override
    public void operation() {
        System.out.println("Hello Leaf!!");
    }
}
