package org.developx.gof.structural_patterns.decorator.code.basic.decorator;

import org.developx.gof.structural_patterns.decorator.code.basic.Component;

public abstract class Decorator implements Component {

    protected final Component wrappee;
    public Decorator(Component wrappee) {
        this.wrappee = wrappee;
    }
}
