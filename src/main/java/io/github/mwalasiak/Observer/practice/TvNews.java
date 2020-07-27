package io.github.mwalasiak.Observer.practice;

public class TvNews implements Observer {
    @Override
    public void updateForecast(final WeatherForecast weatherForecast) {
        System.out.println("Tv - weather forecast for today temperature is " + weatherForecast.getTemperature() + "C and pressure is" + weatherForecast.getPressure() + "hp");
    }
}
