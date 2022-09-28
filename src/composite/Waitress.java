package composite;

import java.util.Iterator;

public final class Waitress {

    private final MenuComponent menu;

    public Waitress(MenuComponent menu) {
        this.menu = menu;
    }

    public void printMenu() {
        menu.print();
    }

    public void printVegetarianMenu() {
        Iterator<MenuComponent> iterator = menu.createIterator();

        System.out.println("VEGETARIAN MENU");
        System.out.println("-----------------------------------");
        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            try {
                if (menuComponent.isVegetarian()) {
                    menuComponent.print();
                }
            } catch (UnsupportedOperationException exception) {
                //skip
            }
        }

    }

}
