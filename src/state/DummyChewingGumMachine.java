package state;

public class DummyChewingGumMachine {

    private final static int NO_GUMS = 0;
    private final static int NO_COIN = 1;
    private final static int COIN_INSERTED = 2;
    private final static int GUM_SOLD = 3;

    private int state = NO_GUMS;
    private int numberOfGums;

    DummyChewingGumMachine(int numberOfGums) {
        this.numberOfGums = numberOfGums;
        if (numberOfGums > 0) {
            state = NO_COIN;
        }
    }

    void insertCoin() {
        switch (state) {
            case NO_GUMS -> System.out.println("You can't insert coin when machine is empty.");
            case NO_COIN -> {
                state = COIN_INSERTED;
                System.out.println("Coin has been inserted.");
            }
            case COIN_INSERTED -> System.out.println("You can't insert more than one coin.");
            case GUM_SOLD -> System.out.println("Please wait for your chewing gum.");
        }
    }

    void returnCoin() {
        switch (state) {
            case NO_GUMS ->
                    System.out.println("No coin to return (when machine is empty it's impossible to insert a coin).");
            case NO_COIN -> System.out.println("No coin to return.");
            case COIN_INSERTED -> {
                state = NO_COIN;
                System.out.println("Coin has been returned.");
            }
            case GUM_SOLD -> System.out.println("Coin can't be returned (gum sold).");
        }
    }

    void turnTheKnob() {
        switch (state) {
            case NO_GUMS -> System.out.println("Nothing happens (machine is empty).");
            case NO_COIN -> System.out.println("First insert a coin.");
            case COIN_INSERTED -> {
                state = GUM_SOLD;
                System.out.println("Chewing gum purchased.");
                handOver();
            }
            case GUM_SOLD -> System.out.println("Nothing happens (chewing gum already purchased).");
        }
    }

    void handOver() {
        switch (state) {
            case NO_GUMS, COIN_INSERTED -> System.out.println("No chewing gum for you!");
            case NO_COIN -> System.out.println("First pay.");
            case GUM_SOLD -> {
                System.out.println("Chewing gum coming...");
                if (--numberOfGums == 0) {
                    System.out.println("Run out of gums.");
                    state = NO_GUMS;
                } else {
                    state = NO_COIN;
                }
            }
        }
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
