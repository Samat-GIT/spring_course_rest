package com.samat.spring.rest.exeption_handling;

public class NoSuchEmployeeException extends RuntimeException
{
    public NoSuchEmployeeException(String message) {
        super(message);
    }
}
