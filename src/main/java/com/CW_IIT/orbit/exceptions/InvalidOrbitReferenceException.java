package com.CW_IIT.orbit.exceptions;

public class InvalidOrbitReferenceException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public InvalidOrbitReferenceException(String errorMessage) {
        super(errorMessage);
    }
}
