package pl.learning;

import pl.learning.component.GreetingComponent;

import java.time.LocalDateTime;

public class Main {
    public static void main (String []args){
        GreetingComponent greeting = new GreetingComponent();
        greeting.sayHello();
        greeting.sayHello();
        greeting.sayHello();

    }
}
