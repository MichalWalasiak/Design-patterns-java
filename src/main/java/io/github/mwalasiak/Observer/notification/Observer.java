package io.github.mwalasiak.Observer.notification;

import io.github.mwalasiak.Observer.Order.Order;

public interface Observer {
    void update(Order order);
}
