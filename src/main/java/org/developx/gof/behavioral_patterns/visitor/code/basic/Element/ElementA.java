package org.developx.gof.behavioral_patterns.visitor.code.basic.Element;

import org.developx.gof.behavioral_patterns.visitor.code.basic.visitor.Visitor;

public class ElementA implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
