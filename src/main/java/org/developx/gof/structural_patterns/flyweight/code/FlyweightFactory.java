package org.developx.gof.structural_patterns.flyweight.code;

import java.util.HashSet;
import java.util.Set;

public class FlyweightFactory {

    Set<Flyweight> cache = new HashSet<>();

    public Flyweight getFlyweight(String intrinsitState) {
        return cache.stream()
                .filter(flyweight -> intrinsitState.equals(flyweight.intrinsitState()))
                .findAny()
                .orElseGet(() -> createFlyweight(intrinsitState));
    }
    private Flyweight createFlyweight(String intrinsitState) {
        Flyweight flyweight = new Flyweight(intrinsitState);
        cache.add(flyweight);
        return flyweight;
    }
}
