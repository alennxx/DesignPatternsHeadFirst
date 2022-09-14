package factory.pizza;

import factory.factory.ingredient.IngredientsFactory;

public final class FourCheese extends Pizza {

    public FourCheese(IngredientsFactory ingredientsFactory) {
        super("four cheese", ingredientsFactory);
    }

}
