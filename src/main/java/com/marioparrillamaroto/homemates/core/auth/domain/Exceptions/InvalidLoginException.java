package com.marioparrillamaroto.homemates.core.auth.domain.Exceptions;

import com.marioparrillamaroto.homemates.shared.domain.BaseException;
import com.marioparrillamaroto.homemates.shared.domain.Constants;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@ToString
public final class InvalidLoginException extends BaseException {
    public InvalidLoginException(String invalidData) {
        super();
        this.code = Constants.Exceptions.Auth.INVALID_LOGIN.CODE;
        this.msg = Constants.Exceptions.Auth.INVALID_LOGIN.MSG.replace("$", invalidData);
        this.status = HttpStatus.CONFLICT;
    }
}
