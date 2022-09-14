package strategy.duck;

import strategy.behavior.fly.FlyingWithWings;
import strategy.behavior.quack.RealQuacking;

public class WildDuck extends Duck {

    public WildDuck() {
        super(new FlyingWithWings(), new RealQuacking());
    }

    @Override
    public String getName() {
        return "Wild Duck";
    }
}
