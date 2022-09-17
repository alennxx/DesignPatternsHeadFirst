package command.command.lighting;

import command.command.Command;
import command.model.Lighting;

abstract class LightingCommand implements Command {
    protected final Lighting lighting;

    protected LightingCommand(Lighting lighting) {
        this.lighting = lighting;
    }

}
