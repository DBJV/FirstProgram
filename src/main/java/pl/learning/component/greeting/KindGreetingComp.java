package pl.learning.component.greeting;

public class KindGreetingComp extends GreetingComponent {

    @Override
    public void sayHello() {
        System.out.println("Good morning. I was created at : " + creationDate);
    }

}
