package com.marioparrillamaroto.homemates.core.auth.domain;

import com.marioparrillamaroto.homemates.core.auth.domain.Exceptions.InvalidRegisterException;
import com.marioparrillamaroto.homemates.shared.domain.BaseException;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AuthUserRepositoryPort {
    AuthUserEntity register(AuthUserEntity entity) throws InvalidRegisterException;
    Optional<AuthUserEntity> login(String username, String passwrd);
    void checkEntityAlreadyExists(AuthUserEntity entity) throws InvalidRegisterException;
}
