package org.developx.gof.creational_patterns.bullder.code;

import org.assertj.core.api.Assertions;
import org.developx.gof.creational_patterns.bullder.code.basic.Builder;
import org.developx.gof.creational_patterns.bullder.code.basic.ConcreteBuilder;
import org.developx.gof.creational_patterns.bullder.code.basic.Director;
import org.developx.gof.creational_patterns.bullder.code.basic.Product;
import org.developx.gof.creational_patterns.bullder.code.pizza.CalzonePizza;
import org.developx.gof.creational_patterns.bullder.code.pizza.NyPizza;
import org.developx.gof.creational_patterns.bullder.code.pizza.Pizza;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayName("[생성패턴] builder pattern")
class BuilderTest {

    @DisplayName("빌더 패턴을 통해 Product 생성한다.")
    @Test
    void test(){
        // given
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);

        // when
        Product product = director.construct();
        // then
        assertThat(product.itemA()).isEqualTo("itemA");
        assertThat(product.itemB()).isEqualTo("itemB");
    }

    @DisplayName("뉴욕피자를 라지 사이즈로 생성한다.")
    @Test
    void createNyPizze(){
        // given
        NyPizza.Builder builder = new NyPizza.Builder(NyPizza.Size.LARGE);
        builder.addTopping(Pizza.Topping.HAM);
        builder.addTopping(Pizza.Topping.MUSHROOM);

        // when
        NyPizza pizza = (NyPizza) builder.build();

        // then
        assertThat(pizza.getToppingSet().size()).isEqualTo(2);
        assertThat(pizza.getSize()).isEqualTo(NyPizza.Size.LARGE);
    }

    @DisplayName("칼초네 피자를 찍먹으로 생성한다.")
    @Test
    void createCalzonePizza(){
        // given
        CalzonePizza.Builder builder = new CalzonePizza.Builder(true);
        builder.addTopping(Pizza.Topping.HAM);
        builder.addTopping(Pizza.Topping.MUSHROOM);

        // when
        CalzonePizza pizza = (CalzonePizza) builder.build();

        // then
        assertThat(pizza.getToppingSet().size()).isEqualTo(2);
        assertThat(pizza.isSauceInside()).isTrue();
    }


}