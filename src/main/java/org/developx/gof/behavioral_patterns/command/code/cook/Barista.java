package org.developx.gof.behavioral_patterns.command.code.cook;

public class Barista {
    public static Coffee createAmericano() {
        return Coffee.AMERICANO;
    }

    public static Coffee createLatte() {
        return Coffee.LATTE;
    }
}
