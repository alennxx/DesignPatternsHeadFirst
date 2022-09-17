package command.command.garagegate;

import command.model.GarageGate;

public class CloseGarageGate extends GarageGateCommand {

    public CloseGarageGate(GarageGate garageGate) {
        super(garageGate);
    }

    @Override
    public void execute() {
        garageGate.close();
    }

}
