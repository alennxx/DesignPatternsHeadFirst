package compound;

import java.util.ArrayList;
import java.util.List;

public class Observable implements QuackObservable {

    private final List<Observer> observers;
    private final QuackObservable quacking;

    public Observable(QuackObservable quacking) {
        this.observers = new ArrayList<>();
        this.quacking = quacking;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(quacking));
    }
}
