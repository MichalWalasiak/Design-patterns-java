package io.github.mwalasiak;

import io.github.mwalasiak.Observer.Order.Order;
import io.github.mwalasiak.Observer.Order.OrderStatus;
import io.github.mwalasiak.Observer.notification.Email;
import io.github.mwalasiak.Observer.notification.MobileApp;
import io.github.mwalasiak.Observer.notification.TextMessage;

public class Main {

    public static void main(String[] args) {

        Order order = new Order(110L, OrderStatus.Registered);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        textMessage.updateOrderStatus(order);
        mobileApp.updateOrderStatus(order);
        email.updateOrderStatus(order);
    }
}
