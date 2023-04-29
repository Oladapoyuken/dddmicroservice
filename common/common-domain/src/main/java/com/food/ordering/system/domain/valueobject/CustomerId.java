package com.food.ordering.system.domain.valueobject;

import java.util.UUID;

/**
 * Created by: @oladapoyuken
 * Date: 29/04/2023
 */
public class CustomerId extends BaseId<UUID>{
    public CustomerId(UUID value) {
        super(value);
    }
}
