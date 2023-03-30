package com.company;

public class InvalidPersonNameException extends Exception {
    public InvalidPersonNameException(String errorMessage) {
        super(errorMessage);
    }
}
