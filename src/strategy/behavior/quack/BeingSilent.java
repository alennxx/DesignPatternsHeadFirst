package strategy.behavior.quack;

public class BeingSilent implements QuackingStrategy {

    @Override
    public void quack() {
        System.out.println("...");
    }

}
