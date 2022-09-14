package decorator.ingredient;

import decorator.Drink;

public abstract class Ingredient extends Drink {
    private final Drink drink;

    protected Ingredient(Drink drink, String name) {
        super(name);
        this.drink = drink;
    }

    @Override
    public String getDescription() {
        return drink.getDescription() + ", " + getName();
    }

    @Override
    public double cost() {
        return drink.cost() + unitCost();
    }

}
