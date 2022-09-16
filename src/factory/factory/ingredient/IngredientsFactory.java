package factory.factory.ingredient;

import factory.pizza.ingredient.cheese.Cheese;
import factory.pizza.ingredient.dough.Dough;
import factory.pizza.ingredient.sauce.Sauce;
import factory.pizza.ingredient.vegetable.Vegetable;

public interface IngredientsFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Vegetable[] createVegetables();
}
