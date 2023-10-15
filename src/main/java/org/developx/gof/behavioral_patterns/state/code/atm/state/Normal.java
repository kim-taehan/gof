package org.developx.gof.behavioral_patterns.state.code.atm.state;

public class Normal implements State{
    @Override
    public int withdraw(int balance, int money) {
        return money;
    }

    @Override
    public int balance(int balance) {
        return balance;
    }
}
