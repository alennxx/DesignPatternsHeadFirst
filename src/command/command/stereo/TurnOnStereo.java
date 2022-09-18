package command.command.stereo;

import command.command.AbstractCommand;
import command.command.Command;
import command.model.Stereo;

public class TurnOnStereo extends AbstractCommand<Stereo> {

    public TurnOnStereo(Stereo stereo) {
        super(stereo);
    }

    @Override
    public void execute() {
        appliance.turnOn();
    }

    @Override
    public void undo() {
        appliance.turnOff();
    }
}
