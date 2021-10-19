package com.balaluevegor.shop.rest.advice;

import com.balaluevegor.shop.exception.PizzaNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class PizzaAdvice {
    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(PizzaNotFoundException.class)
    public String PizzaNotFound(){
        return ("U are 2FAT");
    }
}
