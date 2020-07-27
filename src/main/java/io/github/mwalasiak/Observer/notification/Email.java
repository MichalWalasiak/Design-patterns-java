package io.github.mwalasiak.Observer.notification;

import io.github.mwalasiak.Observer.Order.Order;

public class Email {
    public void updateOrderStatus(Order order) {
        System.out.println("E-mail - order nr " + order.getOrderNumber() + "has changed status to " + order.getOrderStatus());
    }
}