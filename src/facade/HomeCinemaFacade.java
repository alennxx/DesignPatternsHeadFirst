package facade;

public class HomeCinemaFacade {
    private final Amplifier amplifier;
    private final DvdPlayer dvdPlayer;
    private final CdPlayer cdPlayer;
    private final Projector projector;
    private final Lighting lighting;
    private final Screen screen;
    private final PopcornMachine popcornMachine;

    public HomeCinemaFacade(Amplifier amplifier, DvdPlayer dvdPlayer, CdPlayer cdPlayer, Projector projector, Lighting lighting, Screen screen, PopcornMachine popcornMachine) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.lighting = lighting;
        this.screen = screen;
        this.popcornMachine = popcornMachine;
    }

    public void playMovie(String movie) {
        popcornMachine.turnOn();
        popcornMachine.makePopcorn();

        lighting.turnOn();
        lighting.dim(10);
        screen.down();

        projector.turnOn();
        projector.setInput(dvdPlayer);
        projector.setMode(Projector.Mode.WIDESCREEN);

        amplifier.setInput(dvdPlayer);
        amplifier.setSoundMode(Amplifier.SoundMode.SURROUND);
        amplifier.setVolume(5);

        dvdPlayer.turnOn();
        dvdPlayer.play(movie);
    }

    public void turnOffMovie() {
        popcornMachine.turnOff();
        lighting.turnOff();
        screen.up();
        projector.turnOff();
        amplifier.turnOff();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.turnOff();
    }
}
