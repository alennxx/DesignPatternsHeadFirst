package iterator;

public final class Waitress {

    private final PancakeHouseMenu pancakeHouseMenu;
    private final DinerMenu dinerMenu;

    public Waitress() {
        pancakeHouseMenu = new PancakeHouseMenu();
        dinerMenu = new DinerMenu();
    }

    public void printMenu() {
        for (MenuItem item : pancakeHouseMenu.getMenu()) {
            printMenuItem(item);
        }
        for (MenuItem item : dinerMenu.getMenu()) {
            printMenuItem(item);
        }
        //341
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

    private void printMenuItem(MenuItem menuItem) {
        System.out.print(menuItem.getName() + " ");
        System.out.print(menuItem.getPrice() + " ");
        System.out.println(menuItem.getDescription());
    }
}
