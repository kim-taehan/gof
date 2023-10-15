package org.developx.gof.behavioral_patterns.state.code.atm.state;


public class Inspection implements State{

    @Override
    public int withdraw(int balance, int money) {
        throw new IllegalStateException();
    }

    @Override
    public int balance(int balance) {
        return balance;
    }
}
