package facade;

public class DvdPlayer extends Player {

    public DvdPlayer() {
        super("DVD Player");
    }

    public void play(String movie) {
        System.out.println(movie + " is playing");
    }

}
