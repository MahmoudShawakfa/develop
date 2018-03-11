package com.expedia.assignment;

public class InvalidResponseException extends RuntimeException {

    public InvalidResponseException(String message) {
        super(message);
    }
}
