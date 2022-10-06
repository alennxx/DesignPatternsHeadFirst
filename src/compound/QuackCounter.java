package compound;

public class QuackCounter implements Quacking {

    private static int numberOfQuacks = 0;
    private final Quacking duck;

    public QuackCounter(Quacking duck) {
        this.duck = duck;
    }

    public static int getNumberOfQuacks() {
        return numberOfQuacks;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfQuacks++;
    }

}
