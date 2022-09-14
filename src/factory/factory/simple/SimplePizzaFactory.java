package factory.factory.simple;

import factory.pizza.*;

public class SimplePizzaFactory {

    public Pizza getPizza(String type) {
        if ("four cheese".equals(type)) {
            return new FourCheese();
        }
        else if ("pepperoni".equals(type)) {
            return new Pepperoni();
        }
        else if ("seafood".equals(type)) {
            return new Seafood();
        }
        else if ("vegetarian".equals(type)) {
            return new Vegetarian();
        }
        else {
            throw new IllegalArgumentException("Unknown pizza type!");
        }
    }

}
