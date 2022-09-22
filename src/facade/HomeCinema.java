package facade;

public class HomeCinema {

    private static final String HARRY_POTTER = "Harry Potter and the Sorcerer's Stone";

    public static void main(String[] args) {
        //playMovieWithoutFacade();
        playMovieWithFacade();
    }

    private static void playMovieWithFacade() {
        Amplifier amplifier = new Amplifier();
        DvdPlayer dvdPlayer = new DvdPlayer();
        CdPlayer cdPlayer = new CdPlayer();
        Projector projector = new Projector();
        Lighting lighting = new Lighting();
        Screen screen = new Screen();
        PopcornMachine machine = new PopcornMachine();
        HomeCinemaFacade facade = new HomeCinemaFacade(amplifier, dvdPlayer, cdPlayer, projector, lighting, screen, machine);

        facade.playMovie(HARRY_POTTER);
        System.out.println();
        facade.turnOffMovie();
    }

    private static void playMovieWithoutFacade() {
        DvdPlayer dvdPlayer = new DvdPlayer();

        PopcornMachine popcorn = new PopcornMachine();
        popcorn.turnOn();
        popcorn.makePopcorn();

        Lighting lighting = new Lighting();
        lighting.dim(10);

        Screen screen = new Screen();
        screen.down();

        Projector projector = new Projector();
        projector.turnOn();
        projector.setInput(dvdPlayer);
        projector.setMode(Projector.Mode.WIDESCREEN);

        Amplifier amplifier = new Amplifier();
        amplifier.setInput(dvdPlayer);
        amplifier.setSoundMode(Amplifier.SoundMode.SURROUND);
        amplifier.setVolume(5);

        dvdPlayer.turnOn();
        dvdPlayer.play(HARRY_POTTER);
    }
}
