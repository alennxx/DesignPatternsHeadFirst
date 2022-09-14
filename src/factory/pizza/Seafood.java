package factory.pizza;

import factory.factory.ingredient.IngredientsFactory;

public final class Seafood extends Pizza {

    public Seafood(IngredientsFactory ingredientsFactory) {
        super("seafood", ingredientsFactory);
    }
}
