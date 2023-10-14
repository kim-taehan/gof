package org.developx.gof.creational_patterns.bullder.code.pizza;

import java.util.EnumSet;
import java.util.Set;

public abstract class Pizza {
    public Set<Topping> getToppingSet() {
        return toppingSet;
    }

    public enum Topping {HAM, MUSHROOM, ONION, SAUSAGE}
    private final Set<Topping> toppingSet;

    abstract static class Builder<T extends Builder<T>>{
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(topping);
            return self();
        }

        abstract Pizza build();

        protected abstract T self();
    }

    public Pizza(Builder<?> builder) {
        this.toppingSet = builder.toppings.clone();
    }
}
