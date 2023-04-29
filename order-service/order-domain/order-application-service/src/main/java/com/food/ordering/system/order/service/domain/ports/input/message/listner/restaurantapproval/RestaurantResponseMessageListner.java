package com.food.ordering.system.order.service.domain.ports.input.message.listner.restaurantapproval;

import com.food.ordering.system.order.service.domain.dto.message.PaymentResponse;
import com.food.ordering.system.order.service.domain.dto.message.RestaurantApprovalResponse;

/**
 * Created by: @oladapoyuken
 * Date: 29/04/2023
 */
public interface RestaurantResponseMessageListner {
    void orderApproved(RestaurantApprovalResponse restaurantApprovalResponse);

    void orderRejected(RestaurantApprovalResponse restaurantApprovalResponse);
}
