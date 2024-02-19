package com.gate.keeper.exception;

import org.springframework.security.core.AuthenticationException;

public class CsrfViolationException extends AuthenticationException {

    public CsrfViolationException(String message) {
        super(message);
    }
}
