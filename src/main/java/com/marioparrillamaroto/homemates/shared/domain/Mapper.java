package com.marioparrillamaroto.homemates.shared.domain;

import java.util.List;

public interface Mapper<Entity, Dto> {
    Dto mapEntityToDto(Entity entity);

    Entity mapDtoToEntity(Dto dto);

    List<Dto> mapEntityListToDtoList(List<Entity> entityList);

    List<Entity> mapDtoListToEntityList(List<Dto> dtoList);
}
