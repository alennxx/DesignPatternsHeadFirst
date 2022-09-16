package command;

import command.command.Command;

public class MiniRemote {
    private Command buttonCommand;

    public MiniRemote() {
        //nop
    }

   public void setCommand(Command command) {
       buttonCommand = command;
   }

   public void buttonPressed() {
       buttonCommand.execute();
   }

}
