package command.command.ceilingfan;

import command.command.Command;
import command.model.CeilingFan;

abstract class CeilingFanCommand implements Command {

    protected CeilingFan ceilingFan;

    protected CeilingFanCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

}
