package state;

public class Test {

    public static void main(String[] args) {
        //testDummyMachine();
        testMachine();
        //447
    }

    private static void testMachine() {
        ChewingGumMachine machine = new ChewingGumMachine(100);
        System.out.println(machine);

        for (int i = 0; i < 20; i++) {
            machine.insertCoin();
            machine.turnTheKnob();
            System.out.println();
        }

        System.out.println(machine);

    }

    private static void testDummyMachine() {
        DummyChewingGumMachine machine = new DummyChewingGumMachine(2);
        System.out.println(machine);

        machine.insertCoin();
        machine.turnTheKnob();

        System.out.println(machine);

        machine.insertCoin();
        machine.returnCoin();
        machine.turnTheKnob();

        System.out.println(machine);

        machine.returnCoin();
        machine.insertCoin();
        machine.insertCoin();
        machine.turnTheKnob();

        System.out.println(machine);
    }

}
