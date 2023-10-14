package org.developx.gof.structural_patterns.composite.code;

import org.developx.gof.structural_patterns.composite.code.back.Back;
import org.developx.gof.structural_patterns.composite.code.back.Drug;
import org.developx.gof.structural_patterns.composite.code.basic.Composite;
import org.developx.gof.structural_patterns.composite.code.basic.Leaf;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@DisplayName("[구조패턴] composite pattern")
class CompositeTest {

    @DisplayName("composite 를 수행시에 내부에 존재하는 leaf도 수행된다.")
    @Test
    void operation() {
        Leaf[] leaves = new Leaf[]{
                new Leaf(), new Leaf()
        };
        Composite composite = new Composite(leaves);
        composite.operation();
    }
    @DisplayName("가방에 포함된 아이템의 무게를 측정한다.")
    @Test
    void findBackWeight() {

        Back bigBack = new Back(100);
        Back smallBack = new Back(40);

        smallBack.addItem(new Drug(10));
        smallBack.addItem(new Drug(10));
        smallBack.addItem(new Drug(10));

        bigBack.addItem(smallBack);
        bigBack.addItem(new Drug(10));

        assertThat(smallBack.getWeight()).isEqualTo(70);
        assertThat(bigBack.getWeight()).isEqualTo(180);

    }

}