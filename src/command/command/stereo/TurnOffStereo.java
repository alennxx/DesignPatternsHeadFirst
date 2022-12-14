package command.command.stereo;

import command.command.AbstractCommand;
import command.command.Command;
import command.model.Stereo;

public class TurnOffStereo extends AbstractCommand<Stereo> {

    public TurnOffStereo(Stereo stereo) {
        super(stereo);
    }

    @Override
    public void execute() {
        appliance.turnOff();
    }

    @Override
    public void undo() {
        appliance.turnOn();
    }

}
