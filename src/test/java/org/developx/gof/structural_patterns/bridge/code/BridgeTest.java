package org.developx.gof.structural_patterns.bridge.code;

import org.assertj.core.api.Assertions;
import org.developx.gof.structural_patterns.bridge.code.basic.Abstraction;
import org.developx.gof.structural_patterns.bridge.code.basic.ConcreteImplementation;
import org.developx.gof.structural_patterns.bridge.code.basic.Implementation;
import org.developx.gof.structural_patterns.bridge.code.basic.RefinedAbstraction;
import org.developx.gof.structural_patterns.bridge.code.remote.AdvanceRemote;
import org.developx.gof.structural_patterns.bridge.code.remote.Remote;
import org.developx.gof.structural_patterns.bridge.code.remote.device.Device;
import org.developx.gof.structural_patterns.bridge.code.remote.device.Radio;
import org.developx.gof.structural_patterns.bridge.code.remote.device.Tv;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("[구조패턴] bridge pattern")
class BridgeTest {

    @DisplayName("브리지 패턴으로 재정의된 추상적인을 확인한다.")
    @Test
    void bridgeTest(){
        // given
        Implementation implementation = new ConcreteImplementation();
        Abstraction abstraction = new Abstraction(implementation);
        RefinedAbstraction refinedAbstraction = new RefinedAbstraction(implementation);

        // when
        // then
        String normalRet = abstraction.operation();
        String advanceRet = refinedAbstraction.operation();

        Assertions.assertThat(normalRet).isEqualTo("기본기능");
        Assertions.assertThat(advanceRet).isEqualTo("기본기능|추가기능");
    }

    @DisplayName("Radio 일반 리모콘으로 볼륨조절 할 수 있다")
    @Test
    void radioRemote(){
        // given
        Radio radio = new Radio(10);
        Remote remoteRadio = new Remote(radio);

        // when
        remoteRadio.volDown();
        remoteRadio.volUp();
        remoteRadio.volUp();

        // then
        Assertions.assertThat(remoteRadio.getVol()).isEqualTo(11);
    }

    @DisplayName("Radio advance 리모콘으로 Mute 기능 사용시 애러가 발생")
    @Test
    void RatioAdvanceRemoteErrorMute(){
        // given
        Device device = new Radio(10);
        AdvanceRemote remoteRadio = new AdvanceRemote(device);

        // when
        Assertions.assertThatThrownBy(() -> remoteRadio.mute())
                .isInstanceOf(IllegalArgumentException.class);
    }
    @DisplayName("TV advance 리모콘으로 Mute 기능으로 볼륨을 0으로 만든다.")
    @Test
    void tvAdvanceRemote(){
        // given
        Device device = new Tv(10);
        AdvanceRemote remote = new AdvanceRemote(device);

        // when
        remote.mute();

        Assertions.assertThat(remote.getVol()).isEqualTo(0);
    }


}