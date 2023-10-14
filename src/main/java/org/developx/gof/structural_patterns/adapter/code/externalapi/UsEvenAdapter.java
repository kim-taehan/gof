package org.developx.gof.structural_patterns.adapter.code.externalapi;

import java.util.Map;

public class UsEvenAdapter implements EvenAdapter {

    private final Map<String, String> converter = Map.of("even", "짝수",  "odd", "홀수");

    @Override
    public String operation(int number) {
        String ret = UsApi.run(number);
        return converter.getOrDefault(ret, "짝수");
    }
    
    // 미국 API 계산기
    private static abstract class UsApi {
        static String run(int number) {
            return number % 2 == 0 ? "even" : "odd";
        }
    }
}
