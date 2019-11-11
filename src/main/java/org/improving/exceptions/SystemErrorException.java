package org.improving.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class SystemErrorException extends RuntimeException {
    public SystemErrorException() {
        super("Something went wrong.");
    }
}
