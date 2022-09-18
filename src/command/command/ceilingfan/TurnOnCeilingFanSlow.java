package command.command.ceilingfan;

import command.model.CeilingFan;

public class TurnOnCeilingFanSlow extends CeilingFanCommand {

    public TurnOnCeilingFanSlow(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    protected CeilingFan.Mode getCeilingFanMode() {
        return CeilingFan.Mode.SLOW;
    }

}
