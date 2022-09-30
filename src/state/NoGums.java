package state;

class NoGums implements State {

    private final ChewingGumMachine machine;

    public NoGums(ChewingGumMachine machine) {
        this.machine = machine;
    }

    @Override
    public void insertCoin() {
        System.out.println("You can't insert coin when machine is empty.");
    }

    @Override
    public void returnCoin() {
        System.out.println("No coin to return (when machine is empty it's impossible to insert a coin).");
    }

    @Override
    public void turnTheKnob() {
        System.out.println("Nothing happens (machine is empty).");
    }

    @Override
    public void handOver() {
        System.out.println("No chewing gum for you!");
    }

}
