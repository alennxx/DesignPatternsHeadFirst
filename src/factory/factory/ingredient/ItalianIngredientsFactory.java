package factory.factory.ingredient;

import factory.pizza.ingredient.cheese.Cheese;
import factory.pizza.ingredient.cheese.Reggiano;
import factory.pizza.ingredient.dough.Dough;
import factory.pizza.ingredient.dough.ThinCrispyDough;
import factory.pizza.ingredient.sauce.MarinaraSauce;
import factory.pizza.ingredient.sauce.Sauce;
import factory.pizza.ingredient.vegetable.*;

public class ItalianIngredientsFactory implements IngredientsFactory {
    @Override
    public Dough createDough() {
        return new ThinCrispyDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Reggiano();
    }

    @Override
    public Vegetable[] createVegetables() {
        return new Vegetable[]{ new Garlic(), new Onion(), new Champignon(), new RedPepper()};
    }

}
