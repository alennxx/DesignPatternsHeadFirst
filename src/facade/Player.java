package facade;

abstract class Player extends Appliance {
    protected Player(String name) {
        super(name);
    }

    public void stop() {
        System.out.println("Player is stopped");
    }

    public void eject() {
        System.out.println("Disc ejected");
    }
}
