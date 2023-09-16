package com.marioparrillamaroto.homemates.core.auth.infrastructure;

import com.marioparrillamaroto.homemates.core.auth.domain.Exceptions.InvalidLoginException;
import com.marioparrillamaroto.homemates.core.auth.domain.Exceptions.InvalidRegisterException;
import com.marioparrillamaroto.homemates.shared.domain.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AuthExceptionHandle {
    @ExceptionHandler(InvalidRegisterException.class)
    public final ResponseEntity<ErrorResponse> handle(InvalidRegisterException exception) {
        return ResponseEntity
                .status(exception.getStatus())
                .body(new ErrorResponse(exception));
    }

    @ExceptionHandler(InvalidLoginException.class)
    public final ResponseEntity<ErrorResponse> handle(InvalidLoginException exception) {
        return ResponseEntity
                .status(exception.getStatus())
                .body(new ErrorResponse(exception));
    }
}
