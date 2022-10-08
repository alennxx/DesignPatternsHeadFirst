package compound;

public class Quacologist implements Observer {

    @Override
    public void update(QuackObservable quack) {
        System.out.println("Quackologist: " + quack + " quaked");
    }
}
