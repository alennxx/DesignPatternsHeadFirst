package command.command.ceilingfan;

import command.model.CeilingFan;

public class TurnOnCeilingFanStandard extends CeilingFanCommand {

    public TurnOnCeilingFanStandard(CeilingFan ceilingFan) {
        super(ceilingFan);
    }

    @Override
    protected CeilingFan.Mode getCeilingFanMode() {
        return CeilingFan.Mode.STANDARD;
    }

}
