package pl.learning.component;

import pl.learning.component.greeting.GreetingComponent;

public class Main {
    public static void main (String []args) throws InterruptedException {
        //referencja moze wskazywac na jeden obiekt a nastepnie na inny.
        GreetingComponent greeting = new GreetingComponent();
        greeting.sayHello();
        greeting = new GreetingComponent();
        greeting.sayHello();
//         referencja moze nie wskazywac na zaden obiekt.
        GreetingComponent greetingPointer = null;
//        greetingPointer.sayHello();
        // na obiekt nie musi wskazywac zadna referencja, natomiast na
        // nowo utworzonym obiekcie mozemy wywolywac metode
        new GreetingComponent().sayHello();
        new GreetingComponent().sayHello();

        /*w celu przypisania dwoch referencji do jednego obiektu
        przypisujemy wartosc wskazywana przez pierwsza referencje do drugiej
        */
        GreetingComponent greetingRef = new GreetingComponent();
        GreetingComponent greetingRef2 = greetingRef;

        greetingRef.sayHello();
        greetingRef2.sayHello();
        greetingRef = new GreetingComponent();
        greetingRef.sayHello();
        greetingRef2.sayHello();

        System.out.println("////////////////////////////////////////////////");

        GreetingComponent first = new GreetingComponent();

        Thread.sleep(859);

        GreetingComponent second = new GreetingComponent();
        first.sayHello();
        second.sayHello();

    }
}
