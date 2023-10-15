package org.developx.gof.behavioral_patterns.observer.code.basic;


public class ConcreteObserver implements Observer {

    private int kospi;

    @Override
    public int getKospi() {
        return kospi;
    }

    @Override
    public void update(int kospi){
        this.kospi = kospi;
    }
}
