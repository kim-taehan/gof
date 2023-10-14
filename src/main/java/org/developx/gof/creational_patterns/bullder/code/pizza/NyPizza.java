package org.developx.gof.creational_patterns.bullder.code.pizza;

import java.util.Set;

public class NyPizza extends Pizza {

    public enum Size {SMALL, MEDIUM, LARGE}

    private final Size size;

    public Size getSize() {
        return size;
    }

    public static class Builder extends Pizza.Builder<Builder> {

        private final Size size;
        public Builder(Size size) {
            this.size = size;
        }

        @Override
        public Pizza build() {
            return new NyPizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    public NyPizza(Builder builder) {
        super(builder);
        this.size = builder.size;
    }
}
