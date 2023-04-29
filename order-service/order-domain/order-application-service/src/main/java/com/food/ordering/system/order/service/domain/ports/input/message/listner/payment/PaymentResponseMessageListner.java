package com.food.ordering.system.order.service.domain.ports.input.message.listner.payment;

import com.food.ordering.system.order.service.domain.dto.message.PaymentResponse;

/**
 * Created by: @oladapoyuken
 * Date: 29/04/2023
 */
public interface PaymentResponseMessageListner {
    void paymentCompleted(PaymentResponse paymentResponse);

    void paymentCancelled(PaymentResponse paymentResponse);
}
