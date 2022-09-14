package observer.observer;

import observer.WeatherParameters;
import observer.observer.Observer;
import observer.observer.Screen;
import observer.subject.Subject;

public class CurrentConditionsScreen implements Observer, Screen {

    private final Subject weatherData;
    private float temperature;
    private float humidity;

    public CurrentConditionsScreen(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.subscribe(this);
    }

    @Override
    public void update(WeatherParameters parameters) {
        temperature = parameters.getTemperature();
        humidity = parameters.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current weather conditions:");
        System.out.println("Temperature: " + temperature);
        System.out.println("Humidity: " + humidity);
        System.out.println();
    }
}
