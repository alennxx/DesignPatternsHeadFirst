package command.command.ceilingfan;

import command.command.Command;
import command.model.CeilingFan;

public class TurnOffCeilingFan extends CeilingFanCommand {

    public TurnOffCeilingFan(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    protected CeilingFan.Mode getCeilingFanMode() {
        return CeilingFan.Mode.TURNED_OFF;
    }

}
