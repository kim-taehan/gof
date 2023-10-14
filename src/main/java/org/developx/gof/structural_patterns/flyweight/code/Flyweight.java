package org.developx.gof.structural_patterns.flyweight.code;

public record Flyweight(String intrinsitState) {

    public String operation(String extrinsitState) {
        return this.intrinsitState + "-" + extrinsitState;
    }
}
