package com.marioparrillamaroto.homemates.core.users.domain;


import java.util.List;

public interface UserService {
    List<UserDTO> getAllUsers();
    UserDTO getUserById(Long id);
    UserDTO getUserByUsername(Long username);
    UserDTO getUserByEmail(String email);
    UserDTO getUserByDNI(UserDNI dni);
    UserDTO updateUser(UserDTO dto);
    boolean removeUser(UserDTO dto);
    boolean removeUserById(String id);
}
