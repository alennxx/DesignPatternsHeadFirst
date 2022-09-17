package command.command.stereo;

import command.model.Stereo;

public class TurnOnCD extends StereoCommand {

    public TurnOnCD(Stereo stereo) {
        super(stereo);
    }

    @Override
    public void execute() {
        stereo.turnOn();
        stereo.setMode(Stereo.Mode.CD);
        stereo.setVolume(51);
    }
}
