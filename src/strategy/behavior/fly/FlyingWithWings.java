package strategy.behavior.fly;

public class FlyingWithWings implements FlyingStrategy {
    @Override
    public void fly() {
        System.out.println("I'm flying with wings");
    }
}
