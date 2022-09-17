package command.command.ceilingfan;

import command.model.CeilingFan;

public class TurnOffCeilingFan extends CeilingFanCommand {

    public TurnOffCeilingFan(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    public void execute() {
        ceilingFan.turnOff();
    }

}
