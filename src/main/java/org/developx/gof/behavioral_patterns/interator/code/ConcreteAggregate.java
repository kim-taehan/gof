package org.developx.gof.behavioral_patterns.interator.code;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcreteAggregate<T> implements Iterable<T> {

    List<T> list = new ArrayList<>();
    public ConcreteAggregate() {
    }
    public void add(T o) {
        list.add(o);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(list);
    }
}
