package command.command.stereo;

import command.command.Command;
import command.model.Stereo;

abstract class StereoCommand implements Command {
    protected final Stereo stereo;

    protected StereoCommand(Stereo stereo) {
        this.stereo = stereo;
    }

}
