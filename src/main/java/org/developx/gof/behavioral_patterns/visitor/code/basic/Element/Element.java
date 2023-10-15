package org.developx.gof.behavioral_patterns.visitor.code.basic.Element;

import org.developx.gof.behavioral_patterns.visitor.code.basic.visitor.Visitor;

public interface Element {
    void accept(Visitor visitor);
}
