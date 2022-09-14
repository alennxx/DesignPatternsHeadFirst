package decorator;

public abstract class Drink {

    private final String name;

    protected Drink(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return getName();
    }

    public double cost() {
        return unitCost();
    }

    public abstract double unitCost();

}
