package com.marioparrillamaroto.homemates.core.auth.infrastructure;

import com.marioparrillamaroto.homemates.core.auth.domain.AuthUserDTO;
import com.marioparrillamaroto.homemates.core.auth.domain.AuthUserEntity;
import com.marioparrillamaroto.homemates.shared.domain.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AuthUserMapper implements Mapper<AuthUserEntity, AuthUserDTO> {
    @Override
    public AuthUserDTO mapEntityToDto(AuthUserEntity entity) {
        return new AuthUserDTO(
                entity.getId(),
                entity.getUsername(),
                entity.getName(),
                entity.getSurnames(),
                entity.getEmail(),
                entity.getPhonenumber(),
                entity.getDni(),
                entity.getCountry(),
                entity.getPassword(),
                entity.getCreatorUsername()
        );
    }

    @Override
    public AuthUserEntity mapDtoToEntity(AuthUserDTO dto) {
        return new AuthUserEntity(
                dto.getId(),
                dto.getUsername(),
                dto.getName(),
                dto.getSurnames(),
                dto.getEmail(),
                dto.getPhonenumber(),
                dto.getDni(),
                dto.getCountry(),
                dto.getPassword(),
                null,
                null,
                dto.getCreatorUsername()
        );
    }

    @Override
    public List<AuthUserDTO> mapEntityListToDtoList(List<AuthUserEntity> entityList) {
        return entityList.stream().map(this::mapEntityToDto).toList();
    }

    @Override
    public List<AuthUserEntity> mapDtoListToEntityList(List<AuthUserDTO> dtoList) {
        return dtoList.stream().map(this::mapDtoToEntity).toList();
    }
}
