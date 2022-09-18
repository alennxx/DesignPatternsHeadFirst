package command.command;

public class NoCommand implements Command {

    @Override
    public void execute() {
        // nothing happens
    }

    @Override
    public void undo() {
        // nothing happens
    }
}
