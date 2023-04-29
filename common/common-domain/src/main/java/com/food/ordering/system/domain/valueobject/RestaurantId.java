package com.food.ordering.system.domain.valueobject;

import java.util.UUID;

/**
 * Created by: @oladapoyuken
 * Date: 29/04/2023
 */
public class RestaurantId extends BaseId<UUID>{
    public RestaurantId(UUID value) {
        super(value);
    }
}
