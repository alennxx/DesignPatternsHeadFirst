package command.command.tv;

import command.command.AbstractCommand;
import command.command.Command;
import command.model.TV;

public class TurnOffTv extends AbstractCommand<TV> {

    public TurnOffTv(TV tv) {
        super(tv);
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
