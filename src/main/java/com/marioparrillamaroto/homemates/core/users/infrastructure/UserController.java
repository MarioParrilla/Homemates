package com.marioparrillamaroto.homemates.core.users.infrastructure;

import com.marioparrillamaroto.homemates.core.users.domain.UserDTO;
import com.marioparrillamaroto.homemates.core.users.domain.UserService;
import com.marioparrillamaroto.homemates.shared.domain.BaseException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("${PUBLIC-API-POINT-V0}/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService service;

    @PostMapping("/")
    public ResponseEntity<List<UserDTO>> getAllUsers() throws BaseException {
        List<UserDTO> users = service.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }
}
