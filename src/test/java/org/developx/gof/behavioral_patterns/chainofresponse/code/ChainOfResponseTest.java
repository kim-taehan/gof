package org.developx.gof.behavioral_patterns.chainofresponse.code;

import org.assertj.core.api.Assertions;
import org.developx.gof.behavioral_patterns.chainofresponse.code.basic.ConcreteHandler1;
import org.developx.gof.behavioral_patterns.chainofresponse.code.basic.ConcreteHandler2;
import org.developx.gof.behavioral_patterns.chainofresponse.code.basic.Handler;
import org.developx.gof.behavioral_patterns.chainofresponse.code.urlparsing.Client;
import org.developx.gof.behavioral_patterns.chainofresponse.code.urlparsing.Url;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("[행동패턴] chain of responsibility pattern")
class ChainOfResponseTest {

    @DisplayName("")
    @Test
    void chainCall(){
        // given
        Handler handler1 = new ConcreteHandler1(null);
        Handler handler2 = new ConcreteHandler2(handler1);
        // when
        handler2.handleRequest("hello chain");
    }

    @DisplayName("입력한 URL을 파싱한다.")
    @Test
    void urlParsingTest(){
        // given
        String urlStr = "http://127.0.0.1:9090";

        // when
        Url url = Client.run(urlStr);
        // then
        Assertions.assertThat(url)
                .extracting("port", "protocol", "domain")
                .contains(9090, "http", "127.0.0.1");
    }


}