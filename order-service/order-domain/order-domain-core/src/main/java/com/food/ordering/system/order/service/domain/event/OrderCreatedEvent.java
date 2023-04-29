package com.food.ordering.system.order.service.domain.event;

import com.food.ordering.system.domain.Event.DomainEvent;
import com.food.ordering.system.order.service.domain.entity.Order;

import java.time.ZonedDateTime;

/**
 * Created by: @oladapoyuken
 * Date: 29/04/2023
 */
public class OrderCreatedEvent extends OrderEvent {

    public OrderCreatedEvent(Order order, ZonedDateTime createdAt) {
        super(order, createdAt);
    }
}
