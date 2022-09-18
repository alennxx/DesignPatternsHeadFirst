package command.command.ceilingfan;

import command.model.CeilingFan;

public class TurnOnCeilingFanFast extends CeilingFanCommand {

    public TurnOnCeilingFanFast(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    protected CeilingFan.Mode getCeilingFanMode() {
        return CeilingFan.Mode.FAST;
    }

}
