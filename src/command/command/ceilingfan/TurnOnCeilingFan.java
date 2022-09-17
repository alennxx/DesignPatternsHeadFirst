package command.command.ceilingfan;

import command.command.Command;
import command.model.CeilingFan;

public class TurnOnCeilingFan extends CeilingFanCommand {

    public TurnOnCeilingFan(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        ceilingFan.turnOn();
    }
}
