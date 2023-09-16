package com.marioparrillamaroto.homemates.core.auth.domain;

import com.marioparrillamaroto.homemates.shared.domain.BaseException;

public interface AuthService {
    AuthUserDTO register(AuthUserDTO dto) throws BaseException;
    AuthUserDTO login(AuthUserDTO dto) throws BaseException;
}
