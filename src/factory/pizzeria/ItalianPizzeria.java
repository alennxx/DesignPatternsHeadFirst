package factory.pizzeria;

import factory.factory.ingredient.IngredientsFactory;
import factory.factory.ingredient.ItalianIngredientsFactory;

public class ItalianPizzeria extends Pizzeria {
    @Override
    protected IngredientsFactory getIngredientsFactory() {
        return new ItalianIngredientsFactory();
    }
}
