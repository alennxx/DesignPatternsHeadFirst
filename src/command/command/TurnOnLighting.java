package command.command;

import command.model.Lighting;

public class TurnOnLighting implements Command {
    private final Lighting lighting;

    public TurnOnLighting(Lighting lighting) {
        this.lighting = lighting;
    }

    @Override
    public void execute() {
        lighting.turnOn();
    }

}
