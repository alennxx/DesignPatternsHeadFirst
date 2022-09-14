package observer;

import observer.observer.CurrentConditionsScreen;
import observer.subject.WeatherData;

public class WeatherStation {

    public static void main(String[] args) {
        WeatherData data = new WeatherData();

        CurrentConditionsScreen screen1 = new CurrentConditionsScreen(data);

        data.setWeather(new WeatherParameters(14, 56, 1000));
        data.setWeather(new WeatherParameters(23, 40, 1200));
    }

}
