package decorator.drink;

import decorator.Drink;

public class Decaffeinated extends Drink {

    protected Decaffeinated() {
        super("Decaffeinated coffee");
    }

    @Override
    public double unitCost() {
        return 1.05;
    }
}
