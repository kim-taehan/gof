package org.developx.gof.structural_patterns.proxy.code;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("[구조패턴] proxy pattern")
class ProxyTest {

    @DisplayName("프록시 패턴을 사용하여 출력되는 문자에 공백을 제거한다.")
    @Test
    void proxyTest(){
        // given
        Subject subject = new RealSubject();
        Proxy proxy = new Proxy(subject);

        // when
        String ret = proxy.operation(" hello proxy ");
        // then
        Assertions.assertThat(ret).isEqualTo("hello proxy");
    }


}