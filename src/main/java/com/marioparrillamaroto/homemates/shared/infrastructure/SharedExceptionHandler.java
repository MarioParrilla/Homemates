package com.marioparrillamaroto.homemates.shared.infrastructure;

import com.marioparrillamaroto.homemates.shared.domain.BaseException;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class SharedExceptionHandler {
    @ExceptionHandler(BaseException.class)
    public final ResponseEntity<?> handle(BaseException exception) {
        return ResponseEntity
                .status(exception.getStatus())
                .body(exception);
    }
    @ExceptionHandler(HttpMessageNotReadableException.class)
    public final ResponseEntity<?> handle(HttpMessageNotReadableException exception) {
        return ResponseEntity
                .status(400)
                .body("Required request body is missing");
    }
    @ExceptionHandler(Exception.class)
    public final ResponseEntity<?> handle(Exception exception) {
        return ResponseEntity
                .status(500)
                .body("Server Exception "+exception.getLocalizedMessage());
    }
}
