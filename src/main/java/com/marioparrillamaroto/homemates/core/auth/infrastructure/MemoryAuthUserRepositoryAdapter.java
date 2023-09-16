package com.marioparrillamaroto.homemates.core.auth.infrastructure;

import com.marioparrillamaroto.homemates.core.auth.domain.AuthUserEntity;
import com.marioparrillamaroto.homemates.core.auth.domain.AuthUserRepositoryPort;
import com.marioparrillamaroto.homemates.core.auth.domain.Exceptions.InvalidRegisterException;
import lombok.RequiredArgsConstructor;

import java.util.*;

@RequiredArgsConstructor
public class MemoryAuthUserRepositoryAdapter implements AuthUserRepositoryPort {
    private final List<AuthUserEntity> registeredUsers = new ArrayList<>();
    @Override
    public AuthUserEntity register(AuthUserEntity entity) throws InvalidRegisterException{
        for (AuthUserEntity e : registeredUsers) {
            if(Objects.equals(e, entity))
                return null;
        }
        checkEntityAlreadyExists(entity);
        entity.setCreationDate(new Date());
        entity.setUpdateDate(new Date());
        registeredUsers.add(entity);
        return entity;
    }

    @Override
    public Optional<AuthUserEntity> login(String username, String passwrd) {
        for (AuthUserEntity e : registeredUsers) {
            if(Objects.equals(e.getUsername(), username) && Objects.equals(e.getPassword(), passwrd))
                return Optional.of(e);
        }
        return Optional.empty();
    }

    @Override
    public void checkEntityAlreadyExists(AuthUserEntity entity) throws InvalidRegisterException {
        for (AuthUserEntity e : registeredUsers) {
            String errors = "";
            if(Objects.equals(e.getUsername(), entity.getUsername()))
                errors+=" Username";
            if(Objects.equals(e.getEmail(), entity.getEmail()))
                errors+=" Email";
            if(Objects.equals(e.getDni(), entity.getDni()))
                errors+=" DNI";
            if(Objects.equals(e.getPhonenumber(), entity.getPhonenumber()))
                errors+=" PhoneNumber";
            if(!errors.isEmpty())
                throw new InvalidRegisterException(errors);
        }
    }
}
