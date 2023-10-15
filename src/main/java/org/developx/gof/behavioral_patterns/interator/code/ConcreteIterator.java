package org.developx.gof.behavioral_patterns.interator.code;

import java.util.Iterator;
import java.util.List;

public class ConcreteIterator<T> implements Iterator<T> {
    List<? extends T> list;
    private int nextIndex = 0; // 커서 (for문의 i 변수 역할)
    // 생성자로 순회할 컬렉션을 받아 필드에 참조 시킴
    public ConcreteIterator(List<? extends T> list) {
        this.list = list;
    }
    @Override
    public boolean hasNext() {
        return nextIndex < list.size();
    }

    @Override
    public T next() {
        return list.get(nextIndex++);
    }
}
