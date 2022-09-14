package observer.subject;

import observer.observer.Observer;

import java.util.Observable;

public interface Subject {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers();
}
