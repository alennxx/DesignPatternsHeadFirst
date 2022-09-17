package command.command.garagegate;

import command.command.Command;
import command.model.GarageGate;

public class OpenGarageGate extends GarageGateCommand {

    public OpenGarageGate(GarageGate garageGate) {
        super(garageGate);
    }

    @Override
    public void execute() {
        garageGate.open();
    }

}
