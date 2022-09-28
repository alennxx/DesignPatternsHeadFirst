package composite;

import java.util.Iterator;

abstract class MenuComponent {

    private final String name;
    private final String description;

    protected MenuComponent(String name, String description) {
        this.name = name;
        this.description = description;
    }

    final String getName() {
        return name;
    }

    final String getDescription() {
        return description;
    }

    double getPrice() {
        throw new UnsupportedOperationException("get price");
    }

    boolean isVegetarian() {
        throw new UnsupportedOperationException("is vegetarian");
    }

    void print() {
        throw new UnsupportedOperationException("print");
    }

    void add(MenuComponent component) {
        throw new UnsupportedOperationException("add component");
    }

    void remove(MenuComponent component) {
        throw new UnsupportedOperationException("remove component");
    }

    MenuComponent getChild(int i) {
        throw new UnsupportedOperationException("get child");
    }

    abstract Iterator<MenuComponent> createIterator();
}
