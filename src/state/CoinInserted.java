package state;

class CoinInserted implements State {

    private final ChewingGumMachine machine;

    public CoinInserted(ChewingGumMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("You can't insert more than one coin.");
    }

    @Override
    public void returnCoin() {
        System.out.println("Coin has been returned.");
        machine.setState(machine.getNoCoin());
    }

    @Override
    public void turnTheKnob() {
        System.out.println("Chewing gum purchased.");
        machine.setState(machine.getGumSold());
    }

    @Override
    public void handOver() {
        System.out.println("No chewing gum for you!");
    }

}
