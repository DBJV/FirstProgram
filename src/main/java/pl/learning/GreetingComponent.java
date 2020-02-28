package pl.learning;

import java.time.LocalDateTime;

public class GreetingComponent {

    LocalDateTime creationDate;

   GreetingComponent (){
        creationDate = LocalDateTime.now();
    }

    public void sayHello() {
        System.out.println("Hello World. I was created at : " + creationDate);
    }
}
