package org.developx.gof.structural_patterns.flyweight.font;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class FontFactory {

    private Map<String, Font> cache = new ConcurrentHashMap();

    public Font getFont(Color color, int size) {

        String fontKey = String.format("%s:%n", color.name(), size);
        if (cache.containsKey(fontKey)) {
            return cache.get(fontKey);
        }
        return createFont(color, size, fontKey);

    }

    private Font createFont(Color color, int size, String fontKey) {
        Font newFont = new Font(color, size);
        cache.put(fontKey, newFont);
        return newFont;
    }
}
