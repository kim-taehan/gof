package org.developx.gof.structural_patterns.composite.code.back;

import java.util.HashSet;
import java.util.Set;

public class Back implements Item {

    private final int weight;
    private Set<Item> items = new HashSet<>();
    public Back(int weight) {
        this.weight = weight;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    @Override
    public int getWeight() {

        int itemsSum = items.stream().mapToInt(Item::getWeight).sum();
        return weight + itemsSum;
    }

}
