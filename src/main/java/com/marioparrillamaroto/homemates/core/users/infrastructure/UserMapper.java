package com.marioparrillamaroto.homemates.core.users.infrastructure;

import com.marioparrillamaroto.homemates.core.users.domain.UserDNI;
import com.marioparrillamaroto.homemates.core.users.domain.UserDTO;
import com.marioparrillamaroto.homemates.core.users.domain.UserEntity;
import com.marioparrillamaroto.homemates.shared.domain.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserMapper implements Mapper<UserEntity, UserDTO> {
    @Override
    public UserDTO mapEntityToDto(UserEntity entity) {
        return new UserDTO(
                entity.getId(),
                entity.getUsername(),
                entity.getName(),
                entity.getSurnames(),
                entity.getEmail(),
                entity.getPhonenumber(),
                mapEntityDNIToDtoDNI(entity.getDni()),
                entity.getCountry(),
                entity.getPassword(),
                entity.getCreatorUsername()
        );
    }

    @Override
    public UserEntity mapDtoToEntity(UserDTO dto) {
        return new UserEntity(
                dto.getId(),
                dto.getUsername(),
                dto.getName(),
                dto.getSurnames(),
                dto.getEmail(),
                dto.getPhonenumber(),
                mapDtoDNIToEntityDNI(dto.getDni()),
                dto.getCountry(),
                dto.getPassword(),
                null,
                null,
                dto.getCreatorUsername()
        );
    }

    @Override
    public List<UserDTO> mapEntityListToDtoList(List<UserEntity> entityList) {
        return entityList.stream().map(this::mapEntityToDto).toList();
    }

    @Override
    public List<UserEntity> mapDtoListToEntityList(List<UserDTO> dtoList) {
        return dtoList.stream().map(this::mapDtoToEntity).toList();
    }

    private UserDNI mapEntityDNIToDtoDNI(String dni) {
        return new UserDNI(dni.substring(0, 7), dni.substring(8));
    }
    private String mapDtoDNIToEntityDNI(UserDNI dni) {
        return dni.getNumbers()+dni.getLetter();
    }
}
