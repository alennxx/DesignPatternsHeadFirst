package command.model;

public class Stereo extends Appliance {

    private static final int MIN_VOLUME = 0;
    private static final int MAX_VOLUME = 100;

    private Mode mode;
    private int volume;

    public Stereo() {
        super("Stereo");
        mode = Mode.RADIO;
        volume = (MIN_VOLUME + MAX_VOLUME) / 2;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
        System.out.println("Stereo mode set to " + mode.toString());
    }

    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
            System.out.println("Stereo volume set to " + volume);
        }
    }

    public enum Mode {
        CD,
        DVD,
        RADIO
    }

}
