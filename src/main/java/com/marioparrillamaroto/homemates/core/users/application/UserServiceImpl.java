package com.marioparrillamaroto.homemates.core.users.application;

import com.marioparrillamaroto.homemates.core.users.domain.UserDNI;
import com.marioparrillamaroto.homemates.core.users.domain.UserDTO;
import com.marioparrillamaroto.homemates.core.users.domain.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    @Override
    public List<UserDTO> getAllUsers() {
        return null;
    }

    @Override
    public UserDTO getUserById(Long id) {
        return null;
    }

    @Override
    public UserDTO getUserByUsername(Long username) {
        return null;
    }

    @Override
    public UserDTO getUserByEmail(String email) {
        return null;
    }

    @Override
    public UserDTO getUserByDNI(UserDNI dni) {
        return null;
    }

    @Override
    public UserDTO updateUser(UserDTO dto) {
        return null;
    }

    @Override
    public boolean removeUser(UserDTO dto) {
        return false;
    }

    @Override
    public boolean removeUserById(String id) {
        return false;
    }
}
