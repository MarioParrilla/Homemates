package com.marioparrillamaroto.homemates.core.users.domain;

import java.util.List;

public interface UserRepositoryPort {
    List<UserEntity> getAllUsers();
    UserEntity getUserById(Long id);
    UserEntity getUserByUsername(Long username);
    UserEntity getUserByEmail(String email);
    UserEntity getUserByDNI(UserDNI dni);
    UserEntity updateUser(UserEntity entity);
    boolean removeUser(UserEntity entity);
    boolean removeUserById(String id);
}
