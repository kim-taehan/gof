package org.developx.gof.behavioral_patterns.visitor.code.basic.visitor;

import org.developx.gof.behavioral_patterns.visitor.code.basic.Element.ElementA;
import org.developx.gof.behavioral_patterns.visitor.code.basic.Element.ElementB;

public interface Visitor {
    void visit(ElementA elementA);

    void visit(ElementB elementB);
}
