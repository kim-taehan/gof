package org.developx.gof.creational_patterns.factory_method.code;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("[생성패턴] template method")
class TemplateMethodTest {

    @DisplayName("template method pattern 으로 생성한다.")
    @Test
    void templateMethodTest(){
        // given
        Creator creator = new ConcreteCreator();

        // when
        Product product = creator.create();

        // then
        assertThat(product).isInstanceOf(ConcreteProduct.class);
    }

    @DisplayName("CreatorEnum의 product를 테스트 한다.")
    @Test
    void creatorEnum(){
        // given
        // when
        Product product = CreatorEnum.Product.create();

        // then
        assertThat(product).isInstanceOf(ConcreteProduct.class);
    }

    @DisplayName("CreatorEnum의 ProductNull 의 경우 null 을 반환한다.")
    @Test
    void creatorEnumOfNull(){
        // given
        // when
        Product product = CreatorEnum.ProductNull.create();

        // then
        assertThat(product).isNull();
    }

}