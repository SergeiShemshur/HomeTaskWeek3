package com.geekhub.hw3.auth.exceptions;


public class WrongPasswordException extends AuthException {
    public WrongPasswordException(String message) {
        super(message);
    }
}
