package decorator.drink;

import decorator.Drink;

public class Espresso extends Drink {

    public Espresso() {
        super("Plain espresso");
    }

    @Override
    public double unitCost() {
        return 1.99;
    }
}
