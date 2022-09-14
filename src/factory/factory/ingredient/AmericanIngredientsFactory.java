package factory.factory.ingredient;

import factory.pizza.ingredient.cheese.Cheese;
import factory.pizza.ingredient.cheese.Mozzarella;
import factory.pizza.ingredient.dough.Dough;
import factory.pizza.ingredient.dough.ThickCrispyDough;
import factory.pizza.ingredient.sauce.Sauce;
import factory.pizza.ingredient.sauce.TomatoSauce;
import factory.pizza.ingredient.vegetable.BlackOlives;
import factory.pizza.ingredient.vegetable.Eggplant;
import factory.pizza.ingredient.vegetable.Spinach;
import factory.pizza.ingredient.vegetable.Vegetable;

public class AmericanIngredientsFactory implements IngredientsFactory {
    @Override
    public Dough createDough() {
        return new ThickCrispyDough();
    }

    @Override
    public Sauce createSauce() {
        return new TomatoSauce();
    }

    @Override
    public Cheese createCheese() {
        return new Mozzarella();
    }

    @Override
    public Vegetable[] createVegetables() {
        return new Vegetable[] { new BlackOlives(), new Spinach(), new Eggplant() };
    }
}
