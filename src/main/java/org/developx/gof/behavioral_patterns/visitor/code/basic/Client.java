package org.developx.gof.behavioral_patterns.visitor.code.basic;

import org.developx.gof.behavioral_patterns.visitor.code.basic.Element.ElementA;
import org.developx.gof.behavioral_patterns.visitor.code.basic.Element.ElementB;
import org.developx.gof.behavioral_patterns.visitor.code.basic.visitor.ConcreteVisitor;

public class Client {
    public static void main(String[] args) {
        ElementA elementA = new ElementA();
        ElementB elementB = new ElementB();

        elementA.accept(new ConcreteVisitor());
        elementB.accept(new ConcreteVisitor());
    }
}
