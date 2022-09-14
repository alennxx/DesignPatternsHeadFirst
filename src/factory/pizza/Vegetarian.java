package factory.pizza;

import factory.factory.ingredient.IngredientsFactory;

public final class Vegetarian extends Pizza {

    public Vegetarian(IngredientsFactory ingredientsFactory) {
        super("vegetarian", ingredientsFactory);
    }
}
