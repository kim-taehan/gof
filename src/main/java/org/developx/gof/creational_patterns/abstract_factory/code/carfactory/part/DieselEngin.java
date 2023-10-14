package org.developx.gof.creational_patterns.abstract_factory.code.carfactory.part;

import org.developx.gof.creational_patterns.abstract_factory.code.carfactory.part.enums.EnginType;

public class DieselEngin implements Engin {
    @Override
    public EnginType enginType() {
        return EnginType.DIESEL;
    }
}
