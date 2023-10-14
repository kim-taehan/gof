package org.developx.gof.structural_patterns.composite.code.back;

public class Drug implements Item {

    private final int weight;
    public Drug(int weight) {
        this.weight = weight;
    }

    @Override
    public int getWeight() {
        return weight;
    }

}
