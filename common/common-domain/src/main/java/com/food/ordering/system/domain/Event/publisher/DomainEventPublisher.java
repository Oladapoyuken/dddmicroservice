package com.food.ordering.system.domain.Event.publisher;

import com.food.ordering.system.domain.Event.DomainEvent;

/**
 * Created by: @oladapoyuken
 * Date: 29/04/2023
 */

public interface DomainEventPublisher<T extends DomainEvent> {
    void publish(T domainEvent);
}
