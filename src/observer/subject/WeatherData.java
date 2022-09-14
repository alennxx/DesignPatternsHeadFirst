package observer.subject;

import observer.WeatherParameters;
import observer.observer.Observer;
import observer.subject.Subject;

import java.util.HashSet;
import java.util.Set;

public class WeatherData implements Subject {

    private WeatherParameters weatherParameters;
    private Set<Observer> observers;

    public WeatherData() {
        observers = new HashSet<>();
    }

    public void weatherChanged() {
        notifyObservers();
    }

    public void setWeather(WeatherParameters weatherParameters) {
        this.weatherParameters = weatherParameters;
        weatherChanged();
    }

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(obs -> obs.update(weatherParameters));
    }
}
