package strategy.behavior.fly;

public class NoFlying implements FlyingStrategy {
    @Override
    public void fly() {
        System.out.println("I'm not flying");
    }
}
