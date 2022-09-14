package decorator.ingredient;

import decorator.Drink;

public class Chocolate extends Ingredient {

    public Chocolate(Drink drink) {
        super(drink, "Chocolate");
    }

    @Override
    public double unitCost() {
        return 0.20;
    }
}
