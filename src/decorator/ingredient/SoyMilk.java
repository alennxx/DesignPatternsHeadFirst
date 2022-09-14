package decorator.ingredient;

import decorator.Drink;

public class SoyMilk extends Ingredient {

    public SoyMilk(Drink drink) {
        super(drink, "Soy milk");
    }

    @Override
    public double unitCost() {
        return 0.15;
    }
}
