package strategy.behavior.quack;

public class Squealing implements QuackingStrategy {

    @Override
    public void quack() {
        System.out.println("I'm squealing");
    }

}
