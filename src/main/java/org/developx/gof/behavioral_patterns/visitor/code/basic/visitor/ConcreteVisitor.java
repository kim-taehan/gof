package org.developx.gof.behavioral_patterns.visitor.code.basic.visitor;

import org.developx.gof.behavioral_patterns.visitor.code.basic.Element.ElementA;
import org.developx.gof.behavioral_patterns.visitor.code.basic.Element.ElementB;

public class ConcreteVisitor implements Visitor {
    @Override
    public void visit(ElementA elementA) {
        System.out.println("visit elementA");
    }
    @Override
    public void visit(ElementB elementB) {
        System.out.println("visit elementB");
    }
}
