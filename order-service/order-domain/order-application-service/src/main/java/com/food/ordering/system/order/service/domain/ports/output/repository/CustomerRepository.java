package com.food.ordering.system.order.service.domain.ports.output.repository;

import com.food.ordering.system.order.service.domain.entity.Customer;
import com.food.ordering.system.order.service.domain.entity.Restaurant;

import java.util.Optional;
import java.util.UUID;

/**
 * Created by: @oladapoyuken
 * Date: 29/04/2023
 */

public interface CustomerRepository {

    Optional<Customer> findCustomer(UUID customerId);
}
