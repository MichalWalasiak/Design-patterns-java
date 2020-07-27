package io.github.mwalasiak.Observer.practice;

public class InternetNews implements Observer {
    @Override
    public void updateForecast(final WeatherForecast weatherForecast) {
        System.out.println("Internet - weather forecast for today temperature is " + weatherForecast.getTemperature() + "C and pressure is" + weatherForecast.getPressure() + "hp");
    }
}
