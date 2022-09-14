package strategy.duck;

import strategy.behavior.fly.NoFlying;
import strategy.behavior.quack.BeingSilent;

public class ModelDuck extends Duck {

    public ModelDuck() {
        super(new NoFlying(), new BeingSilent());
    }

    @Override
    public String getName() {
        return "Model";
    }


}
