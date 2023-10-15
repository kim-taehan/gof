package org.developx.gof.behavioral_patterns.state.code.atm;

import org.developx.gof.behavioral_patterns.state.code.atm.state.Finish;
import org.developx.gof.behavioral_patterns.state.code.atm.state.Inspection;
import org.developx.gof.behavioral_patterns.state.code.atm.state.Normal;
import org.developx.gof.behavioral_patterns.state.code.atm.state.State;

import java.util.Map;

public class AtmService {

    private final Map<String, Integer> balance;
    private final State NORMAL;
    private final State INSPECTION;
    private final State FINISH;
    private State state;

    public AtmService(Map<String, Integer> balance) {
        this.balance = balance;
        this.NORMAL = new Normal();
        this.INSPECTION = new Inspection();
        this.FINISH = new Finish();
        this.state = FINISH;
    }

    public int balance(String username) {
        return state.balance( balance.get(username));
    }
    public int withdraw(String username, int money) {
        Integer balance = this.balance.get(username);
        int withdraw = state.withdraw(balance, money);
        this.balance.put(username, balance - withdraw);
        return withdraw;
    }

    public void startInspection() {
        this.state = INSPECTION;
    }

    public void finishAtm() {
        this.state = FINISH;
    }
    public void startAtm() {
        this.state = NORMAL;
    }
}
