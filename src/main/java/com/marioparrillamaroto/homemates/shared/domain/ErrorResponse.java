package com.marioparrillamaroto.homemates.shared.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public final class ErrorResponse {
    private final String code;
    private final String msg;
    private final int status;

    public ErrorResponse(BaseException exception) {
        this.code = exception.getCode();
        this.msg = exception.getMsg();
        this.status = exception.getStatus().value();
    }
}
