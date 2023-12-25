package org.example.behavioral.Strategy;
import java.util.List;

class SemicolonSeparatedStrategy implements Strategy {
    @Override
    public String process(List<String> strings) {
        return String.join(";", strings);
    }
}