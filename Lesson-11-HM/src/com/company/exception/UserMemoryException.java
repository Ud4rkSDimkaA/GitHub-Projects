package com.company.exception;

public class UserMemoryException extends RuntimeException{
    public UserMemoryException() {
        super();
    }

    @Override
    public String getMessage() {
        return "Memory is overloaded!";
    }
}
