package command.command.stereo;

import command.model.Stereo;

public class TurnOffStereo extends StereoCommand {

    public TurnOffStereo(Stereo stereo) {
        super(stereo);
    }

    @Override
    public void execute() {
        stereo.turnOff();
    }

}
