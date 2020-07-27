package io.github.mwalasiak.Observer.notification;

import io.github.mwalasiak.Observer.Order.Order;

public class MobileApp {
    public void updateOrderStatus(Order order) {
        System.out.println("Mobile - order nr " + order.getOrderNumber() + "has changed status to " + order.getOrderStatus());
    }
}
