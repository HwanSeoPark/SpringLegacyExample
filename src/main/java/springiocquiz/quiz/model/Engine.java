package springiocquiz.quiz.model;

import org.springframework.stereotype.Component;

@Component
public class Engine {
    public String getType() {
        return "V8";
    }
}