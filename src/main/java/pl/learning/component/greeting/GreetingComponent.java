package pl.learning.component.greeting;

import java.time.LocalDateTime;

public class GreetingComponent implements GreetingComponentAbstract{

    protected LocalDateTime creationDate; //deklaracja pola creationDate

    public GreetingComponent() {
        creationDate = LocalDateTime.now();
    }

    public void sayHello() {
        System.out.println("Hello World. I was created at : " + creationDate);
    }

    public void sayGoodbye() {
        System.out.println("Goodbye World. Now is :" + LocalDateTime.now());
    }
}
