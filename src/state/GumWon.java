package state;

public class GumWon implements State {

    private final ChewingGumMachine machine;

    public GumWon(ChewingGumMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Please wait for your FREE chewing gum.");
    }

    @Override
    public void returnCoin() {
        System.out.println("Coin can't be returned (gum WON).");
    }

    @Override
    public void turnTheKnob() {
        System.out.println("Nothing happens (chewing gum already purchased - and won!).");
    }

    @Override
    public void handOver() {
        System.out.println("Free gum!");
        machine.releaseGum();
        if (machine.getNumberOfGums() == 0) {
            machine.setState(machine.getNoGums());
        } else {
            machine.releaseGum();
            if (machine.getNumberOfGums() > 0) {
                machine.setState(machine.getNoCoin());
            } else {
                System.out.println("Run out of gums.");
                machine.setState(machine.getNoGums());
            }
        }
    }

    @Override
    public String toString() {
        return "GUM WON";
    }
}
