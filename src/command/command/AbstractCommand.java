package command.command;

public abstract class AbstractCommand<ApplianceT> implements Command {
    protected final ApplianceT appliance;

    protected AbstractCommand(ApplianceT appliance) {
        this.appliance = appliance;
    }
}
