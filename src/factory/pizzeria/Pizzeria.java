package factory.pizzeria;

import factory.factory.ingredient.IngredientsFactory;
import factory.pizza.FourCheese;
import factory.pizza.Pizza;

public abstract class Pizzeria {

    //private final SimplePizzaFactory pizzaFactory;

    protected Pizzeria() {

    }

    protected abstract IngredientsFactory getIngredientsFactory();

    public final Pizza orderPizza(String type) {
        Pizza pizza = preparePizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.wrap();
        return pizza;
    }

    private Pizza preparePizza(String type) {
        IngredientsFactory ingredientsFactory = getIngredientsFactory();
        if ("four cheese".equals(type)) {
            return new FourCheese(ingredientsFactory);
        }
        throw new IllegalArgumentException("Unknown pizza type");
    }

}
