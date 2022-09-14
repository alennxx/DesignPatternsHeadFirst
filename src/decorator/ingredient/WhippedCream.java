package decorator.ingredient;

import decorator.Drink;

public class WhippedCream extends Ingredient {

    public WhippedCream(Drink drink) {
        super(drink, "Whipped cream");
    }

    @Override
    public double unitCost() {
        return 0.10;
    }
}
