package org.developx.gof.structural_patterns.flyweight.font;

import java.awt.*;

public record Font(Color color, int size) {
    public String operation(String comment) {
        return String.format("[%s] %s", color.name(), comment);
    }
}
