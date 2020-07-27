package io.github.mwalasiak.Observer.practice;

public class RadioNews implements Observer {
    @Override
    public void updateForecast(final WeatherForecast weatherForecast) {
        System.out.println("Radio - weather forecast for today temperature is " + weatherForecast.getTemperature() + "C and pressure is" + weatherForecast.getPressure() + "hp");
    }
}
