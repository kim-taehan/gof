package org.developx.gof.creational_patterns.singleton.code;

public final class Singleton {
    private Singleton() {
        // 객체를 외부에서 생성못하게 private 로 지정
    }

    private static class SingletonHolder {
        private final static Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
