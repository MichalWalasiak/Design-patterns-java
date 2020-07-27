package io.github.mwalasiak.Observer.practice;

public interface Observable {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
