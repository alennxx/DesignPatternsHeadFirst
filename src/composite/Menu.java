package composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class Menu extends MenuComponent {

    private final List<MenuComponent> menuComponents;

    public Menu(String name, String description) {
        super(name, description);
        this.menuComponents = new ArrayList<>();
    }

    @Override
    void add(MenuComponent component) {
        menuComponents.add(component);
    }

    @Override
    void remove(MenuComponent component) {
        menuComponents.remove(component);
    }

    @Override
    MenuComponent getChild(int i) {
        return menuComponents.get(i);
    }

    @Override
    void print() {
        // 'inner' iterator
        System.out.println();
        System.out.println(getName() + " -- " + getDescription());
        System.out.println("----------------------------------------------");
        for (MenuComponent component : menuComponents) {
            component.print();
        }
    }

    @Override
    Iterator<MenuComponent> createIterator() {
        return new CompositeIterator(menuComponents.iterator());
    }
}
