package command.command.garagegate;

import command.command.AbstractCommand;
import command.command.Command;
import command.model.GarageGate;

public class OpenGarageGate extends AbstractCommand<GarageGate> {

    public OpenGarageGate(GarageGate garageGate) {
        super(garageGate);
    }

    @Override
    public void execute() {
        appliance.open();
    }

    @Override
    public void undo() {
        appliance.close();
    }

}
