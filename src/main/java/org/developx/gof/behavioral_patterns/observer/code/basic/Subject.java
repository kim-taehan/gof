package org.developx.gof.behavioral_patterns.observer.code.basic;

import java.util.HashSet;
import java.util.Set;

public class Subject {
    private Set<Observer> observers = new HashSet<>();

    public void subscribe(Observer observer) {
        observers.add(observer);
    }
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }
    public void notify2(int kospi) {
        observers.forEach(observer -> observer.update(kospi));
    }
}
