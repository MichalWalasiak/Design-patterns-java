package io.github.mwalasiak.Observer.notification;

import io.github.mwalasiak.Observer.Order.Order;

public class TextMessage implements Observer {
    public void updateOrderStatus(Order order) {
        System.out.println("Sms - order nr " + order.getOrderNumber() + " has changed status to " + order.getOrderStatus());
    }

    @Override
    public void update(final Order order) {

    }
}
