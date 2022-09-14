package strategy;

import strategy.behavior.fly.FlyingWithWings;
import strategy.duck.ModelDuck;

public class DuckSimulator {

    public static void main(String[] args) {
//        Duck duck = new WildDuck();
//        duck.doFly();
//        duck.doQuack();

        ModelDuck duck = new ModelDuck();
        duck.doFly();
        duck.setFlying(new FlyingWithWings());
        duck.doFly();
    }

}
