package org.developx.gof.behavioral_patterns.command.code.cook;

import org.developx.gof.behavioral_patterns.command.code.cook.order.Order;

public class Kiosk {
    private Order order;

    public void setOrder(Order order) {
        this.order = order;
    }

    public Coffee takeOrder() {
        return order.make();
    }
}
