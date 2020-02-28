package pl.learning.component;

import java.time.LocalDateTime;

public class GreetingComponent {

    private LocalDateTime creationDate;

    public GreetingComponent() {
        creationDate = LocalDateTime.now();
    }

    public void sayHello() {
        System.out.println("Hello World. I was created at : " + creationDate);
    }

    public void sayGoodbye() {
        System.out.println("Goodbye World. Now is :" + LocalDateTime.now());
    }
    public void displayValue(int number){
        System.out.println("Liczba a = " + number);
    }
    public int sum( int x, int y){
        int a = x + y;
        return a;
       }

    public int giveMeNumber() {
        return 5;
    }

    public int returnNumber (int x){
        return x;
    }
}
