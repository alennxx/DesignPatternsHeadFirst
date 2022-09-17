package command.command.garagegate;

import command.command.Command;
import command.model.GarageGate;

abstract class GarageGateCommand implements Command {
    protected final GarageGate garageGate;

    protected GarageGateCommand(GarageGate garageGate) {
        this.garageGate = garageGate;
    }

}
