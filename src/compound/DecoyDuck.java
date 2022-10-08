package compound;

public class DecoyDuck implements Quacking {

    private final Observable observable;

    public DecoyDuck() {
        this.observable = new Observable(this);
    }

    @Override
    public void quack() {
        System.out.println("Qua!");
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }

    @Override
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "Decoy Duck";
    }
}
