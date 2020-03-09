package pl.learning.component;

import pl.learning.component.greeting.GreetingComponent;
import pl.learning.component.greeting.GreetingComponentAbstract;
import pl.learning.component.greeting.KindGreetingComp;

public class KindGreetingCompTest {
    public static void main (String[] args){

        KindGreetingComp comp = new KindGreetingComp();
        comp.sayHello();

        GreetingComponent c1 = new KindGreetingComp();
        c1.sayHello();

        GreetingComponentAbstract[] greetingComponents = {new GreetingComponent(), new KindGreetingComp(),
                new KindGreetingComp()};
        ((GreetingComponent) greetingComponents[1]).sayGoodbye();

        for (int i=0; i < greetingComponents.length; i++){
            greetingComponents[i].sayHello();
        }
    }
}
