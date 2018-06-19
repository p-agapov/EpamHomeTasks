package com.agapovp.epam.fundamentals.ht5.ex2;

public class PropertyNoSuchKeyException extends RuntimeException {
    private String propertyKey;

    public PropertyNoSuchKeyException(String message, String propertyKey) {
        super(message);
        this.propertyKey = propertyKey;
    }

    public String getPropertyKey() {
        return propertyKey;
    }
}
