package strategy.behavior.quack;

public class RealQuacking implements QuackingStrategy {
    @Override
    public void quack() {
        System.out.println("I'm really quacking");
    }
}
