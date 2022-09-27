package composite;

public final class Waitress {

    private final MenuComponent menu;

    public Waitress(MenuComponent menu) {
        this.menu = menu;
    }

    public void printMenu() {
        menu.print();
    }

}
