package org.example;

public class MyPersonalException extends RuntimeException {



    public MyPersonalException() {
        super();

    }

    public MyPersonalException(String errorMessage) {
        super(errorMessage);
    }
}
