package org.developx.gof.creational_patterns.singleton.code;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("[생성패턴] singleton")
class SingletonTest {

    @DisplayName("singleton class 의 생성된 객체는 항상 동일하다.")
    @Test
    void createSingletonClass(){
        // given
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();

        // when
        // then
        assertThat(instance1).isSameAs(instance2);
    }
}