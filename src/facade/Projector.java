package facade;

public class Projector extends Appliance {

    public Projector() {
        super("Projector");
    }

    public void setInput(DvdPlayer dvdPlayer) {
        System.out.println("Projector -> DVD Player is set");
    }

    public void setMode(Mode mode) {
        System.out.println("Projector mode is set to " + mode);
    }

    public enum Mode {
        TV,
        WIDESCREEN
    }

}
