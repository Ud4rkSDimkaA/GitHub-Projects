package com.company.exception;

public class UserNullException extends RuntimeException{
    public UserNullException() {
        super();
    }

    @Override
    public String getMessage() {
        return "There are no elements!";
    }
}
