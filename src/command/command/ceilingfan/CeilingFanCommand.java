package command.command.ceilingfan;

import command.command.AbstractCommand;
import command.command.Command;
import command.model.CeilingFan;

abstract class CeilingFanCommand extends AbstractCommand<CeilingFan> {
    private CeilingFan.Mode previousMode;

    protected CeilingFanCommand(CeilingFan appliance) {
        super(appliance);
    }

    protected abstract CeilingFan.Mode getCeilingFanMode();

    @Override
    public final void execute() {
        previousMode = appliance.getMode();
        appliance.setMode(getCeilingFanMode());
    }

    @Override
    public final void undo() {
        appliance.setMode(previousMode);
    }

}
