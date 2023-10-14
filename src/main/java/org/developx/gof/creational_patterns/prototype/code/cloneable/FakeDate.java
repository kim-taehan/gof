package org.developx.gof.creational_patterns.prototype.code.cloneable;

import java.util.Objects;

public record FakeDate (
    int year,
    int month,
    int date
) implements Cloneable {

    @Override
    public Object clone() throws CloneNotSupportedException {
        return new FakeDate(this.year, this.month, this.date);
    }
}
