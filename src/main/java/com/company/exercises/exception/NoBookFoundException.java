package com.company.exercises.exception;

public class NoBookFoundException extends RuntimeException {
    public NoBookFoundException(String message) {
        super(message);
    }
}
