package com.AlexeyPopov1984.exceptions;

public class InvalidWidthOrHeightException extends Exception {
    public InvalidWidthOrHeightException() {
        super("Invalid dimension: must be positive");
    }

    public InvalidWidthOrHeightException(String message) {
        super(message);
    }
}
