package com.myorganisation.nexify.exception;

public class UsernameOrPasswordIncorrectException extends RuntimeException {
    public UsernameOrPasswordIncorrectException() {
        super("Wrong username or password. Try again or create an account .");
    }

    public UsernameOrPasswordIncorrectException(String m) {
        super(m);
    }
}
