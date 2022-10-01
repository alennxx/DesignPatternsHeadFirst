package state;

import java.util.Random;

class CoinInserted implements State {

    private static final int CHANCE_TO_WIN = 10; // 1:10

    private final ChewingGumMachine machine;
    private final Random random;

    public CoinInserted(ChewingGumMachine machine) {
        this.machine = machine;
        random = new Random(System.currentTimeMillis());
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
        if (random.nextInt(CHANCE_TO_WIN) == 0) {
            machine.setState(machine.getGumWon());
        } else {
            machine.setState(machine.getGumSold());
        }

    }

    @Override
    public void handOver() {
        System.out.println("No chewing gum for you!");
    }

    @Override
    public String toString() {
        return "COIN INSERTED";
    }

}
