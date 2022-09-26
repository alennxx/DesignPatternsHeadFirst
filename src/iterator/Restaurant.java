package iterator;

public class Restaurant {

    public static void main(String[] args) {
        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        DinerMenu dinerMenu = new DinerMenu();
        JacksMenu jacksMenu = new JacksMenu();

        Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu, jacksMenu);
        waitress.printMenu();
    }

}
