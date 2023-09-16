package com.marioparrillamaroto.homemates.core.auth.infrastructure;

import com.marioparrillamaroto.homemates.core.auth.domain.AuthUserEntity;
import com.marioparrillamaroto.homemates.core.auth.domain.AuthUserRepositoryPort;
import com.marioparrillamaroto.homemates.core.auth.domain.Exceptions.InvalidRegisterException;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.Objects;
import java.util.Optional;

@RequiredArgsConstructor
public class JpaAuthUserRepositoryAdapter implements AuthUserRepositoryPort {
    @Autowired
    private JpaAuthUserRepository repository;

    @Override
    public AuthUserEntity register(AuthUserEntity entity) throws InvalidRegisterException {
        checkEntityAlreadyExists(entity);
        entity.setCreationDate(new Date());
        entity.setUpdateDate(new Date());
        return repository.save(entity);
    }

    @Override
    public Optional<AuthUserEntity> login(String username, String passwrd) {
        return repository.findByUsernameAndPassword(username, passwrd);
    }

    public void checkEntityAlreadyExists(AuthUserEntity entity) throws InvalidRegisterException {
        String errors = "";
        if(Objects.nonNull(repository.findByUsername(entity.getUsername())))
            errors+=" Username";
        if(Objects.nonNull(repository.findByEmail(entity.getEmail())))
            errors+=" Email";
        if(Objects.nonNull(repository.findByDni(entity.getDni())))
            errors+=" DNI";
        if(Objects.nonNull(repository.findByPhonenumber(entity.getPhonenumber())))
            errors+=" PhoneNumber";
        if(!errors.isEmpty())
            throw new InvalidRegisterException(errors);
    }
}
