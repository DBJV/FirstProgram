package pl.learning;

import pl.learning.component.GreetingComponent;

import java.time.LocalDateTime;

public class Main {
    public static void main (String []args){
        GreetingComponent greeting = new GreetingComponent();
        greeting.sayHello();
        greeting.sayGoodbye();
        greeting.displayValue(12);
        int a = 7;
        greeting.displayValue(a);
        int b = 3 + 4;
        greeting.displayValue(b);
        int c = greeting.giveMeNumber();
        greeting.displayValue(c);
        greeting.displayValue(greeting.giveMeNumber());
        int d = greeting.returnNumber(10);
        greeting.displayValue(d);
        greeting.displayValue(greeting.returnNumber(12));
        greeting.displayValue(greeting.returnNumber(3 + 4));
        greeting.displayValue(greeting.sum(5, 6));

        greeting.displayValue(greeting.division(10,5));
        greeting.displayValue(greeting.multiplication(3,5));

    }
}
