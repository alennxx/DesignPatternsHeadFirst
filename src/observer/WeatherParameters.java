package observer;

public class WeatherParameters {
    private final float temperature;
    private final float humidity;
    private final float pressure;

    protected WeatherParameters(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    protected float getPressure() {
        return pressure;
    }

}
