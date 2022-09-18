package command.model;

public class CeilingFan {

    private Mode mode;

    public CeilingFan() {
        this.mode = Mode.TURNED_OFF;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
        System.out.println("Ceiling fan mode is set to " + mode.toString());
    }

    public Mode getMode() {
        return mode;
    }

    public enum Mode {
        FAST,
        STANDARD,
        SLOW,
        TURNED_OFF
    }
}
