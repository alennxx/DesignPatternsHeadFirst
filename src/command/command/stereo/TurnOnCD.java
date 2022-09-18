package command.command.stereo;

import command.command.AbstractCommand;
import command.command.Command;
import command.model.Stereo;

public class TurnOnCD extends AbstractCommand<Stereo> {

    public TurnOnCD(Stereo stereo) {
        super(stereo);
    }

    @Override
    public void execute() {
        appliance.turnOn();
        appliance.setMode(Stereo.Mode.CD);
        appliance.setVolume(51);
    }

    @Override
    public void undo() {
        appliance.turnOff();
        appliance.setMode(Stereo.Mode.RADIO);
        appliance.setVolume(50);
    }

}
