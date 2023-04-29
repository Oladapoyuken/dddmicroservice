package com.food.ordering.system.domain.exception;

/**
 * Created by: @oladapoyuken
 * Date: 29/04/2023
 */
public class DomainException extends RuntimeException {
    public DomainException(String message) {
        super(message);
    }

    public DomainException(String message, Throwable cause) {
        super(message, cause);
    }
}
