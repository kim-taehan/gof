package org.developx.gof.behavioral_patterns.state.code.atm.state;

public interface State {
    
    // 인출요청
    int withdraw(int balance, int money);

    // 잔액조회
    int balance(int balance);
}
