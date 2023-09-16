package com.marioparrillamaroto.homemates.shared.domain;

import lombok.*;
import org.springframework.http.HttpStatus;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public abstract class BaseException extends Exception {
    protected String code;
    protected String msg;
    protected String stack;
    protected HttpStatus status;
}
