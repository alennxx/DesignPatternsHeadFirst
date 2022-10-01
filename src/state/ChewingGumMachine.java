package state;

public class ChewingGumMachine {

    private final State noGums;
    private final State noCoin;
    private final State coinInserted;
    private final State gumSold;
    private final State gumWon;

    private State state;
    private int numberOfGums;

    public ChewingGumMachine(int numberOfGums) {
        this.numberOfGums = numberOfGums;
        noGums = new NoGums(this);
        noCoin = new NoCoin(this);
        coinInserted = new CoinInserted(this);
        gumSold = new GumSold(this);
        gumWon = new GumWon(this);
        setState();
    }

    public void setState(State state) {
        this.state = state;
    }

    void insertCoin() {
        state.insertCoin();
    }

    void returnCoin() {
        state.returnCoin();
    }

    void turnTheKnob() {
        state.turnTheKnob();
        state.handOver();
    }

    void releaseGum() {
        System.out.println("Chewing gum coming...");
        if (numberOfGums != 0) {
            numberOfGums--;
        }
    }

    void fill(int numberOfGums) {
        this.numberOfGums += numberOfGums;
        setState();
    }

    public State getNoGums() {
        return noGums;
    }

    public State getNoCoin() {
        return noCoin;
    }

    public State getCoinInserted() {
        return coinInserted;
    }

    public State getGumSold() {
        return gumSold;
    }

    public State getGumWon() {
        return gumWon;
    }

    public int getNumberOfGums() {
        return numberOfGums;
    }

    @Override
    public String toString() {
        return "Chewing Gum Machine (" + numberOfGums + " gums left ---- " + state.toString() + ")";
    }

    private void setState() {
        if (numberOfGums > 0) {
            state = noCoin;
        } else {
            state = noGums;
        }
    }

}
