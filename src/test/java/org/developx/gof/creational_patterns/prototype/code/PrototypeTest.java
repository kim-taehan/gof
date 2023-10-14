package org.developx.gof.creational_patterns.prototype.code;

import org.developx.gof.creational_patterns.prototype.code.basic.ConcretePrototypeA;
import org.developx.gof.creational_patterns.prototype.code.basic.Prototype;
import org.developx.gof.creational_patterns.prototype.code.cloneable.FakeDate;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("[생성패턴] prototype method")
class PrototypeTest {

    @DisplayName("prototype 객체 재생성시에 다른 객체지만 내부 값은 복사가 된다.")
    @Test
    void prototypeTest(){
        // given
        // when
        Prototype prototypeA = new ConcretePrototypeA("kimtaehan");
        Prototype prototypeB = prototypeA.clone();

        // then
        assertThat(prototypeA).isNotSameAs(prototypeB);
        assertThat(prototypeA.getText()).isEqualTo(prototypeB.getText());
    }

    @DisplayName("clone 으로 값을 복제하였을때 isNotSamAs, isEqualTo 를 만족한다 ")
    @Test
    void fakeDateTest() throws CloneNotSupportedException {
        // given
        FakeDate fakeDate = new FakeDate(2022, 12, 31);

        // when
        FakeDate cloneDate = (FakeDate) fakeDate.clone();

        // then
        assertThat(fakeDate).isNotSameAs(cloneDate);
        assertThat(fakeDate).isEqualTo(cloneDate);
    }
}