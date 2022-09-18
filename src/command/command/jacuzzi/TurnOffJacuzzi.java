package command.command.jacuzzi;

import command.command.AbstractCommand;
import command.command.Command;
import command.model.Jacuzzi;

public class TurnOffJacuzzi extends AbstractCommand<Jacuzzi> {
    public TurnOffJacuzzi(Jacuzzi appliance) {
        super(appliance);
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
