package facade;

public class Amplifier {

    public void turnOn() {
        System.out.println("Amplifier is turned on");
    }

    public void turnOff() {
        System.out.println("Amplifier is turned off");
    }

    public void setVolume(int volume) {
        System.out.println("Amplifier volume is set to " + volume);
    }

    public void setPlayerMode(PlayerMode playerMode) {
        System.out.println("Amplifier player mode is set to " + playerMode);
    }

    public void setSoundMode(SoundMode soundMode) {
        System.out.println("Amplifier sound mode is set to " + soundMode);
    }

    public enum PlayerMode {
        CD,
        DVD
    }

    public enum SoundMode {
        STEREO,
        SURROUND
    }
}
