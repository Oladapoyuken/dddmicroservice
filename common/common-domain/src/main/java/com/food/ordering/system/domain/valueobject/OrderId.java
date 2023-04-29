package com.food.ordering.system.domain.valueobject;

import java.util.UUID;

/**
 * Created by: @oladapoyuken
 * Date: 29/04/2023
 */
public class OrderId extends BaseId<UUID>{

    public OrderId(UUID value) {
        super(value);
    }
}
