package command;

import command.command.garagegate.CloseGarageGate;
import command.command.garagegate.OpenGarageGate;
import command.command.ceilingfan.TurnOffCeilingFan;
import command.command.ceilingfan.TurnOnCeilingFan;
import command.command.lighting.TurnOffLighting;
import command.command.lighting.TurnOnLighting;
import command.command.stereo.TurnOffStereo;
import command.command.stereo.TurnOnCD;
import command.command.stereo.TurnOnStereo;
import command.model.CeilingFan;
import command.model.GarageGate;
import command.model.Lighting;
import command.model.Stereo;

public class RemoteTest {

    public static void main(String[] args) {
//        miniRemoteTest();
        superRemoteTest();
        //240
    }

    private static void miniRemoteTest() {
        MiniRemote remote = new MiniRemote();
        Lighting lighting = new Lighting("Living Room");
        GarageGate garageGate = new GarageGate();

        TurnOnLighting turnOnLighting = new TurnOnLighting(lighting);
        OpenGarageGate openGarageGate = new OpenGarageGate(garageGate);

        remote.setCommand(turnOnLighting);
        remote.buttonPressed();

        remote.setCommand(openGarageGate);
        remote.buttonPressed();
    }

    private static void superRemoteTest() {
        Lighting lightingDiningRoom = new Lighting("Dining Room");
        TurnOnLighting turnOnDiningRoomLighting = new TurnOnLighting(lightingDiningRoom);
        TurnOffLighting turnOffDiningRoomLighting = new TurnOffLighting(lightingDiningRoom);

        Lighting lightingKitchen = new Lighting("Kitchen");
        TurnOnLighting turnOnKitchenLighting = new TurnOnLighting(lightingKitchen);
        TurnOffLighting turnOffKitchenLighting = new TurnOffLighting(lightingKitchen);

        CeilingFan ceilingFan = new CeilingFan();
        TurnOnCeilingFan turnOnCeilingFan = new TurnOnCeilingFan(ceilingFan);
        TurnOffCeilingFan turnOffCeilingFan = new TurnOffCeilingFan(ceilingFan);

        GarageGate garageGate = new GarageGate();
        OpenGarageGate openGarageGate = new OpenGarageGate(garageGate);
        CloseGarageGate closeGarageGate = new CloseGarageGate(garageGate);

        Stereo stereo = new Stereo();
        TurnOnCD turnOnCD = new TurnOnCD(stereo);
        TurnOffStereo turnOffStereo = new TurnOffStereo(stereo);

        SuperRemote remote = new SuperRemote(4);
        remote.setCommand(0, turnOnDiningRoomLighting, turnOffDiningRoomLighting);
        remote.setCommand(1, turnOnKitchenLighting, turnOffKitchenLighting);
        remote.setCommand(2, turnOnCeilingFan, turnOffCeilingFan);
        remote.setCommand(3, turnOnCD, turnOffStereo);

        System.out.println(remote);

        pressButtons(remote, 0);
        pressButtons(remote, 1);
        pressButtons(remote, 2);
        pressButtons(remote, 3);
    }

    private static void pressButtons(SuperRemote remote, int slot) {
        remote.turnOnButtonPressed(slot);
        remote.turnOffButtonPressed(slot);
    }

}
