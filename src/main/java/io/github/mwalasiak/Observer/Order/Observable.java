package io.github.mwalasiak.Observer.Order;

import io.github.mwalasiak.Observer.notification.Observer;

public interface Observable {

    void registerObserver(Observer observer);
    void unRegisterObserver(Observer observer);
    void notifyObservers();
}
