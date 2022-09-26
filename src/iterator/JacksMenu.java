package iterator;

import java.util.Hashtable;
import java.util.Iterator;

public class JacksMenu implements Menu {

    private final Hashtable<String, MenuItem> menu;

    public JacksMenu() {
        this.menu = new Hashtable<>();
        addMenuItem("Vegetarian sandwich with french fries",
                "Vegetarian sandwich with lettuce and tomato, french fries", true, 3.99);
        addMenuItem("Soup of the day", "Bowl of soup of the day, salad", false, 3.69);
        addMenuItem("Burrito", "Big burrito with beans, salsa sauce and guacamole", true, 4.29);
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return menu.values().iterator();
    }

    private void addMenuItem(String name, String description, boolean vegetarian, double price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        menu.put(name, menuItem);
    }

}
