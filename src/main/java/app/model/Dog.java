package app.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Dog extends Animal{
    @Override
    public String toString() {
        return "Hello, i'm a dog.";
    }
}
