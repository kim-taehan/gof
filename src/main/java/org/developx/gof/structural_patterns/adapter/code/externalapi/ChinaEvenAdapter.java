package org.developx.gof.structural_patterns.adapter.code.externalapi;

public class ChinaEvenAdapter implements EvenAdapter {
    @Override
    public String operation(int number) {
        boolean ret = ChinaApi.go(number);
        return ret ? "짝수" : "홀수";
    }

    private static abstract class ChinaApi {
        static boolean go(int number) {
            return number % 2 == 0;
        }
    }
}
