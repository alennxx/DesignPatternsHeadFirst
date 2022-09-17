package command.command.lighting;

import command.command.Command;
import command.model.Lighting;

public class TurnOffLighting extends LightingCommand {

    public TurnOffLighting(Lighting lighting) {
        super(lighting);
    }

    @Override
    public void execute() {
        lighting.turnOff();
    }

}
