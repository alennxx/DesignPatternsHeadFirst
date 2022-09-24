package iterator;

import java.util.ArrayList;

public final class PancakeHouseMenu {
    private final ArrayList<MenuItem> menu;

    public PancakeHouseMenu() {
        menu = new ArrayList<>();
        initializeMenuItems();
    }

    public ArrayList<MenuItem> getMenu() {
        return menu;
    }

    private void initializeMenuItems() {
        addMenuItem("K&B Pancake Breakfast", "Pancakes with scrambled eggs and toast", true, 2.99);
        addMenuItem("Usual Pancake Breakfast", "Pancakes with fried egg and sausage", false, 2.99);
        addMenuItem("Pancakes with Blueberries", "Pancakes with fresh blueberries", true, 3.49);
        addMenuItem("Stuffed Waffles", "Waffles with blueberries or strawberries", true, 3.59);
    }

    private void addMenuItem(String name, String description, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, description, vegetarian, price);
        menu.add(item);
    }
}
