package org.developx.gof.behavioral_patterns.command.code.cook.order;

import org.developx.gof.behavioral_patterns.command.code.cook.Barista;
import org.developx.gof.behavioral_patterns.command.code.cook.Coffee;

public class AmericanoOrder implements Order {
    @Override
    public Coffee make() {
        return Barista.createAmericano();
    }
}
