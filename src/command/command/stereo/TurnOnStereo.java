package command.command.stereo;

import command.model.Stereo;

public class TurnOnStereo extends StereoCommand {

    public TurnOnStereo(Stereo stereo) {
        super(stereo);
    }

    @Override
    public void execute() {
        stereo.turnOn();
    }

}
