package com.marioparrillamaroto.homemates.core.users.infrastructure;

import com.marioparrillamaroto.homemates.core.users.domain.UserDNI;
import com.marioparrillamaroto.homemates.core.users.domain.UserEntity;
import com.marioparrillamaroto.homemates.core.users.domain.UserRepositoryPort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RequiredArgsConstructor
public class JpaUserRepositoryAdapter implements UserRepositoryPort {
    @Autowired
    private JpaUserRepository repository;

    @Override
    public List<UserEntity> getAllUsers() {
        return null;
    }

    @Override
    public UserEntity getUserById(Long id) {
        return null;
    }

    @Override
    public UserEntity getUserByUsername(Long username) {
        return null;
    }

    @Override
    public UserEntity getUserByEmail(String email) {
        return null;
    }

    @Override
    public UserEntity getUserByDNI(UserDNI dni) {
        return null;
    }

    @Override
    public UserEntity updateUser(UserEntity entity) {
        return null;
    }

    @Override
    public boolean removeUser(UserEntity entity) {
        return false;
    }

    @Override
    public boolean removeUserById(String id) {
        return false;
    }
}
