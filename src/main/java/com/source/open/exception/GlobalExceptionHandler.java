package com.source.open.exception;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    @Autowired
    private MessageSource messageSource;

    @ExceptionHandler(EmptyNameException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ResponseBody
    public ErrorResponse handleEmptyNameException(EmptyNameException ex, Locale locale) {
        String localizedErrorMessage = messageSource.getMessage(ex.getMessageCode(), null, locale);
        return new ErrorResponse(HttpStatus.BAD_REQUEST.value(), localizedErrorMessage);
    }

    // You can add handlers for other exceptions as needed
}
