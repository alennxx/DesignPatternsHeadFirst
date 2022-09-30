package state;

public class Test {

    public static void main(String[] args) {
        testDummyMachine();
        //431
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
