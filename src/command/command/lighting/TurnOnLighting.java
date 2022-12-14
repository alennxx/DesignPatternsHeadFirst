package command.command.lighting;

import command.command.AbstractCommand;
import command.command.Command;
import command.model.Lighting;

public class TurnOnLighting extends AbstractCommand<Lighting> {

    public TurnOnLighting(Lighting lighting) {
        super(lighting);
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
