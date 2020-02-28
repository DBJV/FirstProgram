package pl.learning.component;

import java.time.LocalDateTime;

public class GreetingComponent {

   private LocalDateTime creationDate;

  public GreetingComponent (){
        creationDate = LocalDateTime.now();
    }

    public void sayHello() {
        System.out.println("Hello World. I was created at : " + creationDate);
    }
}
