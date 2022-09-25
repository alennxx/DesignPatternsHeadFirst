package iterator;

import java.util.Iterator;

public final class Waitress {

    private final Menu pancakeHouseMenu;
    private final Menu dinerMenu;

    public Waitress(Menu pancakeHouseMenu, Menu dinerMenu) {
        this.pancakeHouseMenu = pancakeHouseMenu;
        this.dinerMenu = dinerMenu;
    }

    public void printMenu() {
        System.out.println("MENU:");

        Iterator<MenuItem> breakFastIterator = pancakeHouseMenu.createIterator();
        System.out.println("Breakfast menu:");
        printMenu(breakFastIterator);

        Iterator<MenuItem> lunchIterator = dinerMenu.createIterator();
        System.out.println("Lunch menu:");
        printMenu(lunchIterator);
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
