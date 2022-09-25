package iterator;

import java.util.Iterator;

public final class DinerMenu implements Menu {

    private static final int MAX_NUMBER_OF_ITEMS = 6;
    private final MenuItem[] menu;
    private int numberOfItems = 0;

    public DinerMenu() {
        menu = new MenuItem[MAX_NUMBER_OF_ITEMS];
        initializeMenuItems();
    }

    @Override
    public Iterator<MenuItem> createIterator() {
        return new DinerMenuIterator(menu);
    }

    private void initializeMenuItems() {
        addMenuItem("Vegetarian BSP Sandwich", "(Vegetarian) Beacon with lettuce and tomato, whole grain wheat bread",
                true, 2.99);
        addMenuItem("BSP Sandwich", "Beacon with lettuce and tomato, whole grain wheat bread",
                false, 2.99);
        addMenuItem("Soup of the day", "Soup of the day and tomato salad", false, 3.29);
        addMenuItem("Hot-dog", "Hot-dog with sauerkraut, radish, onion and cheese", false, 3.05);
    }

    private void addMenuItem(String name, String description, boolean vegetarian, double price) {
        if (numberOfItems >= MAX_NUMBER_OF_ITEMS) {
            System.err.println("Menu is full! New menu item can not be added.");
        } else {
            MenuItem item = new MenuItem(name, description, vegetarian, price);
            menu[numberOfItems++] = item;
        }
    }
}
