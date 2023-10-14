package org.developx.gof.creational_patterns.bullder.code.pizza;

public class CalzonePizza extends Pizza {

    private final boolean sauceInside;

    public boolean isSauceInside() {
        return sauceInside;
    }

    public static class Builder extends Pizza.Builder<Builder> {

        private final boolean sauceInside;
        public Builder(boolean sauceInside) {
            this.sauceInside = sauceInside;
        }

        @Override
        public Pizza build() {
            return new CalzonePizza(this);
        }

        @Override
        protected Builder self() {
            return this;
        }
    }

    public CalzonePizza(Builder builder) {
        super(builder);
        this.sauceInside = builder.sauceInside;
    }
}
