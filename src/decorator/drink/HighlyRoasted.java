package decorator.drink;

import decorator.Drink;

public class HighlyRoasted extends Drink {

    public HighlyRoasted() {
        super("Highly Roasted Coffee");
    }

    @Override
    public double unitCost() {
        return 0.99;
    }
}
