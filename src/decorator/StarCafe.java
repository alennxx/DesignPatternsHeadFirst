package decorator;

import decorator.drink.Espresso;
import decorator.drink.HighlyRoasted;
import decorator.drink.StarCafeSpecial;
import decorator.ingredient.Chocolate;
import decorator.ingredient.SoyMilk;
import decorator.ingredient.WhippedCream;

public class StarCafe {

    public static void main(String[] args) {
        Drink order1 = new Espresso();
        printOrder(1, order1);

        Drink order2 = new HighlyRoasted();
        order2 = new Chocolate(order2);
        order2 = new Chocolate(order2);
        order2 = new WhippedCream(order2);
        printOrder(2, order2);

        Drink order3 = new StarCafeSpecial();
        order3 = new SoyMilk(order3);
        order3 = new Chocolate(order3);
        order3 = new WhippedCream(order3);
        printOrder(3, order3);
    }

    private static void printOrder(int orderNo, Drink order) {
        System.out.println("Order " + orderNo + ": " + order.getDescription() + " = " + order.cost());
    }

}
