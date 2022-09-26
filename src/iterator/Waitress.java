package iterator;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public final class Waitress {

    private final List<Menu> menus;

    public Waitress(Menu... menus) {
        this.menus = Arrays.asList(menus);
    }

    public void printMenu() {
        System.out.println("MENU:");

        for (Menu menu : menus) {
            printMenu(menu.createIterator());
        }
    }

    public void printBreakfastMenu() {

    }

    public void printLunchMenu() {

    }

    public void printVegetarianMenu() {

    }

    public boolean isVegetarian(String menuItemName) {
        return false;
    }

    private void printMenu(Iterator<MenuItem> menuItemIterator) {
        while (menuItemIterator.hasNext()) {
            printMenuItem(menuItemIterator.next());
        }
        System.out.println();
    }

    private void printMenuItem(MenuItem menuItem) {
        System.out.print(menuItem.getName() + " ");
        System.out.print(menuItem.getPrice() + " -- ");
        System.out.println(menuItem.getDescription());
    }
}
