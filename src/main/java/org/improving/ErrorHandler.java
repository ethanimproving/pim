package org.improving;

import org.improving.exceptions.SystemErrorException;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ErrorHandler {

//    @ExceptionHandler(Exception.class)
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    public String exceptionHandler(Exception e, Model model) {
//        model.addAttribute("errorMessage", e.getMessage());
//        return "bad";
//    }

    @ExceptionHandler(SystemErrorException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public String exceptionHandler(SystemErrorException e, Model model) {
        model.addAttribute("errorMessage", e.getMessage());
        return "bad";
    }
}
