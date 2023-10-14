package org.developx.gof.structural_patterns.flyweight.code;

import org.assertj.core.api.Assertions;
import org.developx.gof.structural_patterns.flyweight.font.Color;
import org.developx.gof.structural_patterns.flyweight.font.Font;
import org.developx.gof.structural_patterns.flyweight.font.FontFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

@DisplayName("[구조패턴] flyweight pattern")
class FlyweightTest {

    @DisplayName("flyweight 패턴으로 자주변하는/변하지 않는 부분을 분리한다.")
    @Test
    void flyweightTest() {
        // given
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight red = factory.getFlyweight("RED");

        // when
        String ret = red.operation("hello flyweight");

        // then
        Assertions.assertThat(ret).isEqualTo("RED-hello flyweight");
    }

    @DisplayName("FontFactory를 통해 Font 를 재활용한다.")
    @Test
    void createFont() {
        FontFactory factory = new FontFactory();
        Font font1 = factory.getFont(Color.BLACK, 10);
        Font font2 = factory.getFont(Color.RED, 20);
        Font font3 = factory.getFont(Color.BLACK, 10);

        Assertions.assertThat(font1).isEqualTo(font3);
        Assertions.assertThat(font2.operation("hello")).isEqualTo("[RED] hello");
    }
}