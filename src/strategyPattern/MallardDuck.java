package strategyPattern;

import strategyPattern.behavior.FlyWithWings;
import strategyPattern.behavior.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("Looks like Mallard duck");
    }
}
