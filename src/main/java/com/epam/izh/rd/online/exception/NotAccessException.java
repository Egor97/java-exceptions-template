package com.epam.izh.rd.online.exception;

public class NotAccessException extends RuntimeException {
    public NotAccessException() {
    }

    public NotAccessException(String message) {
        super(message);
    }

    public NotAccessException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotAccessException(Throwable cause) {
        super(cause);
    }
}
