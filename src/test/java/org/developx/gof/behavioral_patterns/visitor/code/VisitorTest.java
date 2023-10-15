package org.developx.gof.behavioral_patterns.visitor.code;

import org.assertj.core.api.Assertions;
import org.developx.gof.behavioral_patterns.visitor.code.basic.Element.ElementA;
import org.developx.gof.behavioral_patterns.visitor.code.basic.Element.ElementB;
import org.developx.gof.behavioral_patterns.visitor.code.basic.visitor.ConcreteVisitor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
@DisplayName("[행동패턴] visitor method pattern")
class VisitorTest {
    @DisplayName("")
    @Test
    void test(){
        ElementA elementA = new ElementA();
        ElementB elementB = new ElementB();

        elementA.accept(new ConcreteVisitor());
        elementB.accept(new ConcreteVisitor());
    }

}