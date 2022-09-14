package factory.pizza;

import factory.factory.ingredient.IngredientsFactory;

public final class Pepperoni extends Pizza {

    public Pepperoni(IngredientsFactory ingredientsFactory) {
        super("pepperoni", ingredientsFactory);
    }
}
