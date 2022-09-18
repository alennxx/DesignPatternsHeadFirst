package command.command;

public abstract interface Command {
    public void execute();
    public void undo();
}
