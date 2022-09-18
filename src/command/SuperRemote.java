package command;

import command.command.Command;
import command.command.NoCommand;

public class SuperRemote {

    private final int numberOfSlots;
    private Command[] turnOnCommands;
    private Command[] turnOffCommands;
    private Command undoCommand;

    public SuperRemote(int numberOfSlots) {
        this.numberOfSlots = numberOfSlots;
        turnOnCommands = new Command[numberOfSlots];
        turnOffCommands = new Command[numberOfSlots];

        NoCommand noCommand = new NoCommand();
        for (int i = 0; i < numberOfSlots; i++) {
            turnOnCommands[i] = noCommand;
            turnOffCommands[i] = noCommand;
        }
        undoCommand = noCommand;
    }

    public void setCommand(int slot, Command turnOnCommand, Command turnOffCommand) {
        if (slot < numberOfSlots) {
            turnOnCommands[slot] = turnOnCommand;
            turnOffCommands[slot] = turnOffCommand;
        }
    }

    public void turnOnButtonPressed(int slot) {
        buttonPressed(slot, turnOnCommands);
    }

    public void turnOffButtonPressed(int slot) {
        buttonPressed(slot, turnOffCommands);
    }

    public void undoButtonPressed() {
        undoCommand.undo();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\n------ SuperRemote ------\n");
        for (int i = 0; i < numberOfSlots; i++) {
            sb.append("[slot " + i + "]:\t");
            sb.append(turnOnCommands[i].getClass().getSimpleName());
            sb.append("\t\t");
            sb.append(turnOffCommands[i].getClass().getSimpleName());
            sb.append("\n");
        }
        sb.append("[undo]:\t\t");
        sb.append(undoCommand.getClass().getSimpleName());
        return sb.toString();
    }

    private void buttonPressed(int slot, Command[] commands) {
        if (slot >= 0 && slot < numberOfSlots) {
            commands[slot].execute();
            undoCommand = commands[slot];
        }
    }

}
