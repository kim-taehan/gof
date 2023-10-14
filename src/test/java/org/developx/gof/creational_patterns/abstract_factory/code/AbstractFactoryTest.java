package org.developx.gof.creational_patterns.abstract_factory.code;

import org.developx.gof.creational_patterns.abstract_factory.code.basic.Client;
import org.developx.gof.creational_patterns.abstract_factory.code.basic.ConcreteFactory;
import org.developx.gof.creational_patterns.abstract_factory.code.carfactory.Car;
import org.developx.gof.creational_patterns.abstract_factory.code.carfactory.car.factory.CarFactory;
import org.developx.gof.creational_patterns.abstract_factory.code.carfactory.car.factory.DieselCarFactory;
import org.developx.gof.creational_patterns.abstract_factory.code.carfactory.car.factory.GasolineCarFactory;
import org.developx.gof.creational_patterns.abstract_factory.code.carfactory.part.CasolineEngin;
import org.developx.gof.creational_patterns.abstract_factory.code.carfactory.part.enums.EnginType;
import org.developx.gof.creational_patterns.abstract_factory.code.carfactory.part.enums.HandleType;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("[생성패턴] abstract factory")
class AbstractFactoryTest {

    @DisplayName("추상팩토리 패턴을 통해 Product 들의 구상클래스를 모르는 상태로 생성한다.")
    @Test
    void basicTest(){
        // given
        Client client = new Client(new ConcreteFactory());

        // when
        client.createProducts();

        // then
        assertThat(client.getProductA()).isNotNull();
        assertThat(client.getProductB()).isNotNull();
    }

    @DisplayName("가솔린 차의 엔진은 가솔린 엔진에 일반 핸들이다.")
    @Test
    void createGasoline(){
        // given
        CarFactory carFactory = new GasolineCarFactory();

        // when
        Car car = carFactory.createCar();

        // then
        assertThat(car.engin().enginType()).isEqualTo(EnginType.GASOLINE);
        assertThat(car.handle().handleType()).isEqualTo(HandleType.NORMAL);
    }

    @DisplayName("디젤 차의 엔진은 디젤 엔진에 일반 핸들이다.")
    @Test
    void createDiesel(){
        // given
        CarFactory carFactory = new DieselCarFactory();

        // when
        Car car = carFactory.createCar();

        // then
        assertThat(car.engin().enginType()).isEqualTo(EnginType.DIESEL);
        assertThat(car.handle().handleType()).isEqualTo(HandleType.NORMAL);
    }

    @DisplayName("수퍼핸들을 가진 가솔린 팩토리를 기존 소스 변경없이 만들수 있다")
    @Test
    void test2(){
        // given
        CarFactory carFactory = () -> new Car(new CasolineEngin(), () -> HandleType.SUPER);

        // when
        Car car = carFactory.createCar();

        // then
        assertThat(car.engin().enginType()).isEqualTo(EnginType.GASOLINE);
        assertThat(car.handle().handleType()).isEqualTo(HandleType.SUPER);
    }
}