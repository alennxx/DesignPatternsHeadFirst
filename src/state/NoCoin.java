package state;

class NoCoin implements State {

    private final ChewingGumMachine machine;

    public NoCoin(ChewingGumMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin has been inserted.");
        machine.setState(machine.getCoinInserted());
    }

    @Override
    public void returnCoin() {
        System.out.println("No coin to return.");
    }

    @Override
    public void turnTheKnob() {
        System.out.println("First insert a coin.");
    }

    @Override
    public void handOver() {
        System.out.println("First pay.");
    }

    @Override
    public String toString() {
        return "AWAITING COIN";
    }
}
