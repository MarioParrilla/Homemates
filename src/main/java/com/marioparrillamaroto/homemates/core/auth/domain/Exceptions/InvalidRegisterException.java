package com.marioparrillamaroto.homemates.core.auth.domain.Exceptions;

import com.marioparrillamaroto.homemates.shared.domain.BaseException;
import com.marioparrillamaroto.homemates.shared.domain.Constants;
import lombok.ToString;
import org.springframework.http.HttpStatus;

@ToString
public final class InvalidRegisterException extends BaseException {
    public InvalidRegisterException(String invalidData) {
        super();
        this.code = Constants.Exceptions.Auth.INVALID_REGISTER.CODE;
        this.msg = Constants.Exceptions.Auth.INVALID_REGISTER.MSG.replace("user$", "user"+invalidData);
        this.status = HttpStatus.CONFLICT;
    }
}
