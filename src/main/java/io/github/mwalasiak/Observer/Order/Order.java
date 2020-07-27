package io.github.mwalasiak.Observer.Order;

import io.github.mwalasiak.Observer.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class Order implements Observable {

    private Long orderNumber;
    private OrderStatus orderStatus;
    private Set<Observer> registeredObservers = new HashSet<>();

    public Order(final Long orderNumber, final OrderStatus orderStatus) {
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
    }

    @Override
    public void registerObserver(final Observer observer) {

    }

    @Override
    public void unRegisterObserver(final Observer observer) {

    }

    @Override
    public void notifyObservers() {

    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(final Long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(final OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
