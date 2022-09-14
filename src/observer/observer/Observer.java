package observer.observer;

import observer.WeatherParameters;

public interface Observer {
    void update(WeatherParameters parameters);
}
