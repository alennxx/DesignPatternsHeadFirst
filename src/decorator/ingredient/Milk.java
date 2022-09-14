package decorator.ingredient;

import decorator.Drink;

public class Milk extends Ingredient {

    protected Milk(Drink drink) {
        super(drink, "Cow Milk");
    }

    @Override
    public double unitCost() {
        return 0.1;
    }
}
