package command.command.garagegate;

import command.command.AbstractCommand;
import command.command.Command;
import command.model.GarageGate;

public class CloseGarageGate extends AbstractCommand<GarageGate> {

    public CloseGarageGate(GarageGate garageGate) {
        super(garageGate);
    }

    @Override
    public void execute() {
        appliance.close();
    }

    @Override
    public void undo() {
        appliance.open();
    }

}
