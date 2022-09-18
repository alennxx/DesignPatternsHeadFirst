package command.command.jacuzzi;

import command.command.AbstractCommand;
import command.command.Command;
import command.model.Jacuzzi;

public class TurnOnJacuzzi extends AbstractCommand<Jacuzzi> {
    public TurnOnJacuzzi(Jacuzzi appliance) {
        super(appliance);
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
