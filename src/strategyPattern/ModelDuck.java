package strategyPattern;

import strategyPattern.behavior.FlyNoWay;
import strategyPattern.behavior.FlyWithWings;
import strategyPattern.behavior.MuteQuack;

public class ModelDuck extends Duck {

    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new MuteQuack();
    }


    @Override
    public void display() {
        System.out.println("I am a model duck");
    }
}
