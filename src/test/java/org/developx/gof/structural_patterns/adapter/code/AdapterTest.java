package org.developx.gof.structural_patterns.adapter.code;

import org.assertj.core.api.Assertions;
import org.developx.gof.structural_patterns.adapter.code.basic.Adapter;
import org.developx.gof.structural_patterns.adapter.code.basic.Target;
import org.developx.gof.structural_patterns.adapter.code.externalapi.ChinaEvenAdapter;
import org.developx.gof.structural_patterns.adapter.code.externalapi.EvenAdapter;
import org.developx.gof.structural_patterns.adapter.code.externalapi.UsEvenAdapter;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("[구조패턴] adpater pattern")
class AdapterTest {

    @DisplayName("어답터 패턴으로 adaptee에 기능을 몰라서 수행할 수 있다.")
    @Test
    void operation() {
        Target target = new Adapter();
        target.operation();
    }

    @DisplayName("US API로 홀수, 짝수를 확인한다.")
    @Test
    void usApiTest(){
        // given
        EvenAdapter evenAdapter = new UsEvenAdapter();

        // when
        String operation = evenAdapter.operation(10);

        // then
        Assertions.assertThat(operation).isEqualTo("짝수");
    }

    @DisplayName("중국 API로 홀수, 짝수를 확인한다.")
    @Test
    void chinaApiTest(){
        // given
        EvenAdapter evenAdapter = new ChinaEvenAdapter();

        // when
        String operation = evenAdapter.operation(10);

        // then
        Assertions.assertThat(operation).isEqualTo("짝수");
    }

}