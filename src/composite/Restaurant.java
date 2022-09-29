package composite;

public class Restaurant {

    public static void main(String[] args) {
        MenuComponent pancakeHouse = createPancakeHouseMenu();
        MenuComponent diner = createDinerMenu();
        MenuComponent jacks = createJacksMenu();

        MenuComponent restaurantMenu = new Menu("Restaurant Menu", "Menu");
        restaurantMenu.add(pancakeHouse);
        restaurantMenu.add(diner);
        restaurantMenu.add(jacks);

        Waitress waitress = new Waitress(restaurantMenu);
        //waitress.printMenu();
        waitress.printVegetarianMenu();
    }

    private static MenuComponent createPancakeHouseMenu() {
        MenuComponent pancakeHouseMenu = new Menu("Menu Pancake House", "Breakfast");
        addMenuItem(pancakeHouseMenu, "K&B Pancake Breakfast", "Pancakes with scrambled eggs and toast", true, 2.99);
        addMenuItem(pancakeHouseMenu, "Usual Pancake Breakfast", "Pancakes with fried egg and sausage", false, 2.99);
        addMenuItem(pancakeHouseMenu, "Pancakes with Blueberries", "Pancakes with fresh blueberries", true, 3.49);
        addMenuItem(pancakeHouseMenu, "Stuffed Waffles", "Waffles with blueberries or strawberries", true, 3.59);
        return pancakeHouseMenu;
    }

    private static MenuComponent createDinerMenu() {
        MenuComponent dinerMenu = new Menu("Diner Menu", "Lunch");
        addMenuItem(dinerMenu, "Vegetarian BSP Sandwich", "(Vegetarian) Beacon with lettuce and tomato, whole grain wheat bread",
                true, 2.99);
        addMenuItem(dinerMenu, "BSP Sandwich", "Beacon with lettuce and tomato, whole grain wheat bread",
                false, 2.99);
        addMenuItem(dinerMenu, "Soup of the day", "Soup of the day and tomato salad", false, 3.29);
        addMenuItem(dinerMenu, "Hot-dog", "Hot-dog with sauerkraut, radish, onion and cheese", false, 3.05);

        dinerMenu.add(createDessertMenu());
        return dinerMenu;
    }

    private static MenuComponent createJacksMenu() {
        MenuComponent jacksMenu = new Menu("Jacks Menu", "Dinner");
        addMenuItem(jacksMenu, "Vegetarian sandwich with french fries",
                "Vegetarian sandwich with lettuce and tomato, french fries", true, 3.99);
        addMenuItem(jacksMenu, "Soup of the day", "Bowl of soup of the day, salad", false, 3.69);
        addMenuItem(jacksMenu, "Burrito", "Big burrito with beans, salsa sauce and guacamole", true, 4.29);
        return jacksMenu;
    }

    private static MenuComponent createDessertMenu() {
        MenuComponent dessertMenu = new Menu("Diner Dessert Menu", "Dessert");
        addMenuItem(dessertMenu, "Apple Pie", "Apple Pie with vanilla ice cream", true, 1.59);
        return dessertMenu;
    }

    private static void addMenuItem(MenuComponent menu, String name, String description, boolean vegetarian, double price) {
        MenuItem item = new MenuItem(name, description, vegetarian, price);
        menu.add(item);
    }

}
