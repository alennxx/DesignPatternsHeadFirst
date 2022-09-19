package adapter;

public class WIldDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Wild Duck quacks.");
    }

    @Override
    public void fly() {
        System.out.println("Wild Duck flies");
    }
}
