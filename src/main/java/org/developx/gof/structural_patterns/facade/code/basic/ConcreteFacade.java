package org.developx.gof.structural_patterns.facade.code.basic;

import org.developx.gof.structural_patterns.facade.code.basic.sub.SubSystemA;
import org.developx.gof.structural_patterns.facade.code.basic.sub.SubSystemB;

public class ConcreteFacade implements Facade {

    private final SubSystemA subSystemA = new SubSystemA();
    private final SubSystemB subSystemB = new SubSystemB();
    @Override
    public void operation() {
        subSystemA.operationA();
        subSystemB.operationB();
    }
}
