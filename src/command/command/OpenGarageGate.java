package command.command;

import command.model.GarageGate;

public class OpenGarageGate implements Command {

    private GarageGate garageGate;

    public OpenGarageGate(GarageGate garageGate) {
        this.garageGate = garageGate;
    }

    @Override
    public void execute() {
        garageGate.open();
    }
}
