package org.developx.gof.behavioral_patterns.interpreter.code.expression;

import java.util.Map;

public class Context {
    public Map<Character, Integer> mapper;
    public Context(Map<Character, Integer> mapper) {
        this.mapper = mapper;
    }
}
