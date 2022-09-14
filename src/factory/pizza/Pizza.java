package factory.pizza;

import factory.factory.ingredient.IngredientsFactory;
import factory.pizza.ingredient.cheese.Cheese;
import factory.pizza.ingredient.dough.Dough;
import factory.pizza.ingredient.sauce.Sauce;
import factory.pizza.ingredient.vegetable.Vegetable;

import java.util.List;

public abstract class Pizza {
    private final String name;
    private final IngredientsFactory ingredientsFactory;
    private Dough dough;
    private Sauce sauce;
    private Vegetable[] vegetables;
    private Cheese cheese;

    Pizza(String name, IngredientsFactory ingredientsFactory) {
        this.name = name;
        this.ingredientsFactory = ingredientsFactory;
    }

    public final void prepare() {
        dough = ingredientsFactory.createDough();
        sauce = ingredientsFactory.createSauce();
        vegetables = ingredientsFactory.createVegetables();
        cheese = ingredientsFactory.createCheese();
    }

    public final void bake() {
        System.out.println("Baking...");
    }

    public final void cut() {
        System.out.println("Cutting...");
    }

    public final void wrap() {
        System.out.println("Wrapping...");
    }

    public final String getName() {
        return name;
    }



}
