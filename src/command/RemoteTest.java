package command;

import command.command.OpenGarageGate;
import command.command.TurnOnLighting;
import command.model.GarageGate;
import command.model.Lighting;

public class RemoteTest {

    public static void main(String[] args) {
        MiniRemote remote = new MiniRemote();
        Lighting lighting = new Lighting();
        GarageGate garageGate = new GarageGate();

        TurnOnLighting turnOnLighting = new TurnOnLighting(lighting);
        OpenGarageGate openGarageGate = new OpenGarageGate(garageGate);

        remote.setCommand(turnOnLighting);
        remote.buttonPressed();

        remote.setCommand(openGarageGate);
        remote.buttonPressed();

        //232
    }

}
