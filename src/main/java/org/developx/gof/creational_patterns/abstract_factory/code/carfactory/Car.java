package org.developx.gof.creational_patterns.abstract_factory.code.carfactory;

import org.developx.gof.creational_patterns.abstract_factory.code.carfactory.part.Engin;
import org.developx.gof.creational_patterns.abstract_factory.code.carfactory.part.Handle;

public record Car(Engin engin, Handle handle) {
}
