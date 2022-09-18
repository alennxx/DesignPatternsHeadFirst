package command.command.tv;

import command.command.AbstractCommand;
import command.command.Command;
import command.model.TV;

public class TurnOnTv extends AbstractCommand<TV> {
    public TurnOnTv(TV tv) {
        super(tv);
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
