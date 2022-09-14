package factory;

import factory.pizzeria.AmericanPizzeria;
import factory.pizzeria.ItalianPizzeria;
import factory.pizzeria.Pizzeria;

public class LovePizza {

    public static void main(String[] args) {
        Pizzeria italianPizzeria = new ItalianPizzeria();
        italianPizzeria.orderPizza("four cheese");

        Pizzeria americanPizzeria = new AmericanPizzeria();
        americanPizzeria.orderPizza("four cheese");

    }

}
