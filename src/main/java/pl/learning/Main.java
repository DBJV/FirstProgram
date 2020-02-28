package pl.learning;

import java.time.LocalDateTime;

public class Main {
    public static void main (String []args){
        GreetingComponent greeting = new GreetingComponent();
        greeting.sayHello();
        greeting.creationDate = LocalDateTime.now();
        greeting.sayHello();
        greeting.sayHello();

    }
}
