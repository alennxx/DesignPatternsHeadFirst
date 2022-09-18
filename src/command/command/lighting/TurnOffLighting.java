package command.command.lighting;

import command.command.AbstractCommand;
import command.command.Command;
import command.model.Lighting;

public class TurnOffLighting extends AbstractCommand<Lighting> {

    public TurnOffLighting(Lighting lighting) {
        super(lighting);
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
