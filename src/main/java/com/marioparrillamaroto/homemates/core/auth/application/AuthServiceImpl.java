package com.marioparrillamaroto.homemates.core.auth.application;

import com.marioparrillamaroto.homemates.core.auth.domain.AuthService;
import com.marioparrillamaroto.homemates.core.auth.domain.AuthUserDTO;
import com.marioparrillamaroto.homemates.core.auth.domain.AuthUserEntity;
import com.marioparrillamaroto.homemates.core.auth.domain.AuthUserRepositoryPort;
import com.marioparrillamaroto.homemates.core.auth.domain.Exceptions.InvalidLoginException;
import com.marioparrillamaroto.homemates.core.auth.domain.Exceptions.InvalidRegisterException;
import com.marioparrillamaroto.homemates.shared.domain.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {
    private final Mapper<AuthUserEntity, AuthUserDTO> mapper;
    @Autowired
    @Qualifier("JPA-Auth-User-Adapter")
    private final AuthUserRepositoryPort repository;

    @Override
    public AuthUserDTO register(AuthUserDTO dto) throws InvalidRegisterException {
        AuthUserEntity entity = repository.register(mapper.mapDtoToEntity(dto));
        if(Objects.isNull(entity)) throw new InvalidRegisterException("");
        return mapper.mapEntityToDto(entity);
    }

    @Override
    public AuthUserDTO login(AuthUserDTO dto) throws InvalidLoginException {
        AuthUserEntity entity = repository.login(dto.getUsername(), dto.getPassword()).orElse(null);
        if(Objects.isNull(entity)) throw new InvalidLoginException("");
        return mapper.mapEntityToDto(entity);
    }
}
