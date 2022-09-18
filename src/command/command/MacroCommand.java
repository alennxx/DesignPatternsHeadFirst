package command.command;

import java.util.Arrays;

public class MacroCommand implements Command {
    private final Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        Arrays.stream(commands).forEach(Command::execute);
    }

    @Override
    public void undo() {
        for (int i = 0; i < commands.length; i++) {
            int idx = commands.length - (i + 1);
            commands[idx].undo();
        }
    }
}
