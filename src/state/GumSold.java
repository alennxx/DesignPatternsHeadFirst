package state;

class GumSold implements State {

    private final ChewingGumMachine machine;

    public GumSold(ChewingGumMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Please wait for your chewing gum.");
    }

    @Override
    public void returnCoin() {
        System.out.println("Coin can't be returned (gum sold).");
    }

    @Override
    public void turnTheKnob() {
        System.out.println("Nothing happens (chewing gum already purchased).");
    }

    @Override
    public void handOver() {
        machine.releaseGum();
        if (machine.getNumberOfGums() > 0) {
            machine.setState(machine.getNoCoin());
        } else {
            System.out.println("Run out of gums.");
            machine.setState(machine.getNoGums());
        }
    }
}
