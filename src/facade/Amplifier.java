package facade;

public class Amplifier extends Appliance {

    public Amplifier() {
        super("Amplifier");
    }

    public void setVolume(int volume) {
        System.out.println("Amplifier volume is set to " + volume);
    }

    public void setInput(Player player) {
        System.out.println("Amplifier -> Input is set");
    }

    public void setSoundMode(SoundMode soundMode) {
        System.out.println("Amplifier sound mode is set to " + soundMode);
    }

    public enum SoundMode {
        STEREO,
        SURROUND
    }
}
