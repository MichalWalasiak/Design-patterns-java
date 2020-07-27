package io.github.mwalasiak.Observer.practice;

import java.util.HashSet;
import java.util.Set;

public class WeatherForecast implements Observable {

    private int temperature;
    private int pressure;
    private Set<Observer> registeredObservers = new HashSet<>();

    public WeatherForecast(final int temperature, final int pressure) {
        this.temperature = temperature;
        this.pressure = pressure;

    }

    @Override
    public void registerObserver(Observer observer) {
        registeredObservers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : registeredObservers){
            observer.updateForecast(this);
        }
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(final int temperature) {
        this.temperature = temperature;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(final int pressure) {
        this.pressure = pressure;
    }
}
