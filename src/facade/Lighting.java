package facade;

public class Lighting extends Appliance {

    public Lighting() {
        super("Lighting");
    }

    public void dim(int value) {
        System.out.println("Lighting is set to " + value + "%");
    }
}
