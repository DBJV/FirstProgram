package pl.learning.welcome;

import pl.learning.component.greeting.GreetingComponent;

public class MainWelcome {
    public static void main (String []args){
        Welcome czlowiek = new Welcome();
        czlowiek.firstName();
        czlowiek.secondName("Bednarek");
        czlowiek.wiek(25);
        czlowiek.dodawanie(4, 5);
        czlowiek.sqrt(16);
    }
}
