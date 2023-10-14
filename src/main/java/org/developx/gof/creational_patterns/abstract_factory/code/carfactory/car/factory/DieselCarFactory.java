package org.developx.gof.creational_patterns.abstract_factory.code.carfactory.car.factory;

import org.developx.gof.creational_patterns.abstract_factory.code.carfactory.Car;
import org.developx.gof.creational_patterns.abstract_factory.code.carfactory.part.DieselEngin;
import org.developx.gof.creational_patterns.abstract_factory.code.carfactory.part.NormalHandle;

public class DieselCarFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Car(
                new DieselEngin(),
                new NormalHandle()
        );
    }

}
