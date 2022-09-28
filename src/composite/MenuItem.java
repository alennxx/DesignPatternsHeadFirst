package composite;

import java.util.Iterator;

public final class MenuItem extends MenuComponent {

    private final boolean vegetarian;
    private final double price;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        super(name, description);
        this.vegetarian = vegetarian;
        this.price = price;
    }

    @Override
    public boolean isVegetarian() {
        return vegetarian;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    void print() {
        // 'inner' iterator
        System.out.print("\t");
        if (vegetarian) {
            System.out.print("(V) ");
        }
        System.out.println(getName() + ": " + price + " -- " + getDescription());
    }

    @Override
    Iterator<MenuComponent> createIterator() {
        return new EmptyIterator();
    }
}
