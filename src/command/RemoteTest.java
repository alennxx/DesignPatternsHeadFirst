package command;

import command.command.Command;
import command.command.MacroCommand;
import command.command.ceilingfan.TurnOnCeilingFanFast;
import command.command.ceilingfan.TurnOnCeilingFanSlow;
import command.command.garagegate.CloseGarageGate;
import command.command.garagegate.OpenGarageGate;
import command.command.ceilingfan.TurnOffCeilingFan;
import command.command.ceilingfan.TurnOnCeilingFanStandard;
import command.command.jacuzzi.TurnOffJacuzzi;
import command.command.jacuzzi.TurnOnJacuzzi;
import command.command.lighting.TurnOffLighting;
import command.command.lighting.TurnOnLighting;
import command.command.stereo.TurnOffStereo;
import command.command.stereo.TurnOnCD;
import command.command.stereo.TurnOnStereo;
import command.command.tv.TurnOffTv;
import command.command.tv.TurnOnTv;
import command.model.*;

public class RemoteTest {

    public static void main(String[] args) {
//        miniRemoteTest();
//        superRemoteTest();
        partyModeTest();
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
        TurnOnCeilingFanStandard ceilingFanStandard = new TurnOnCeilingFanStandard(ceilingFan);
        TurnOnCeilingFanFast ceilingFanFast = new TurnOnCeilingFanFast(ceilingFan);
        TurnOnCeilingFanSlow ceilingFanSlow = new TurnOnCeilingFanSlow(ceilingFan);
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
        remote.setCommand(2, ceilingFanStandard, turnOffCeilingFan);
        remote.setCommand(3, ceilingFanFast, turnOffCeilingFan);
        remote.setCommand(4, turnOnCD, turnOffStereo);

        System.out.println(remote);

        pressButtons(remote, 0);
        //System.out.println(remote);
        remote.undoButtonPressed();

        pressButtons(remote, 1);

        pressButtons(remote, 2);
        remote.undoButtonPressed();
        remote.turnOnButtonPressed(3);
        remote.undoButtonPressed();

        pressButtons(remote, 4);
    }

    private static void pressButtons(SuperRemote remote, int slot) {
        remote.turnOnButtonPressed(slot);
        remote.turnOffButtonPressed(slot);
    }

    private static void partyModeTest() {
        Lighting lighting = new Lighting("Living Room");
        TurnOnLighting turnOnLighting = new TurnOnLighting(lighting);
        TurnOffLighting turnOffLighting = new TurnOffLighting(lighting);

        TV tv = new TV();
        TurnOnTv turnOnTv = new TurnOnTv(tv);
        TurnOffTv turnOffTv = new TurnOffTv(tv);

        Stereo stereo = new Stereo();
        TurnOnStereo turnOnStereo = new TurnOnStereo(stereo);
        TurnOffStereo turnOffStereo = new TurnOffStereo(stereo);

        Jacuzzi jacuzzi = new Jacuzzi();
        TurnOnJacuzzi turnOnJacuzzi = new TurnOnJacuzzi(jacuzzi);
        TurnOffJacuzzi turnOffJacuzzi = new TurnOffJacuzzi(jacuzzi);

        Command[] turnOnPartyCommands = { turnOnLighting, turnOnStereo, turnOnTv, turnOnJacuzzi };
        Command[] turnOffPartyCommands = { turnOffLighting, turnOffStereo, turnOffTv, turnOffJacuzzi };

        MacroCommand turnOnParty = new MacroCommand(turnOnPartyCommands);
        MacroCommand turnOffParty = new MacroCommand(turnOffPartyCommands);

        SuperRemote remote = new SuperRemote(1);
        remote.setCommand(0, turnOnParty, turnOffParty);

        System.out.println(remote);
        remote.turnOnButtonPressed(0);
        remote.undoButtonPressed();
    }

}
