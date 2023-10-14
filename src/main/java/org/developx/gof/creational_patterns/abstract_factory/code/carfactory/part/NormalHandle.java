package org.developx.gof.creational_patterns.abstract_factory.code.carfactory.part;

import org.developx.gof.creational_patterns.abstract_factory.code.carfactory.part.enums.HandleType;

public class NormalHandle implements Handle {
    @Override
    public HandleType handleType() {
        return HandleType.NORMAL;
    }
}
