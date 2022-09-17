package command.command.lighting;

import command.command.Command;
import command.model.Lighting;

public class TurnOnLighting extends LightingCommand {

    public TurnOnLighting(Lighting lighting) {
        super(lighting);
    }

    @Override
    public void execute() {
        lighting.turnOn();
    }

}
