package facade;

public class PopcornMachine extends Appliance {

    public PopcornMachine() {
        super("Popcorn Machine");
    }

    public void makePopcorn() {
        System.out.println("Preparing popcorn");
    }

}
