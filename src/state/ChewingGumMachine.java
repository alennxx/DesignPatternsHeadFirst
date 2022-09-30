package state;

public class ChewingGumMachine {

    private final State noGums;
    private final State noCoin;
    private final State coinInserted;
    private final State gumSold;

    private State state;
    private int numberOfGums;

    public ChewingGumMachine(int numberOfGums) {
        this.numberOfGums = numberOfGums;
        noGums = new NoGums(this);
        noCoin = new NoCoin(this);
        coinInserted = new CoinInserted(this);
        gumSold = new GumSold(this);
        if (numberOfGums > 0) {
            state = noCoin;
        } else {
            state = noGums;
        }
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

    public int getNumberOfGums() {
        return numberOfGums;
    }

    @Override
    public String toString() {
        String p1 = "Chewing Gum Machine (" + numberOfGums + " gums left ---- ";
        String p2 = switch (state) {
            case NO_GUMS -> "EMPTY";
            case NO_COIN -> "AWAITING COIN";
            case COIN_INSERTED -> "COIN INSERTED";
            case GUM_SOLD -> "GUM SOLD";
            default -> "UNKNOWN";
        };
        return p1 + p2 + ")";
    }

}
