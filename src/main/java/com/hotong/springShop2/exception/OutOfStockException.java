package com.hotong.springShop2.exception;

public class OutOfStockException extends RuntimeException{

    public OutOfStockException(String message) {
        super(message);
    }

}