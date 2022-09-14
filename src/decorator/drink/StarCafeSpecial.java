package decorator.drink;

import decorator.Drink;

public class StarCafeSpecial extends Drink {

    public StarCafeSpecial() {
        super("Special Star Cafe coffee");
    }

    @Override
    public final double unitCost() {
        return 0.89;
    }
}
