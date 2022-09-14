package factory.pizzeria;

import factory.factory.ingredient.AmericanIngredientsFactory;
import factory.factory.ingredient.IngredientsFactory;
import factory.pizza.Pizza;

public class AmericanPizzeria extends Pizzeria {

    @Override
    protected IngredientsFactory getIngredientsFactory() {
        return new AmericanIngredientsFactory();
    }
}
