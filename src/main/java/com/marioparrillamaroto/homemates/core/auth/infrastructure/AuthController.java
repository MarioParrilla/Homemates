package com.marioparrillamaroto.homemates.core.auth.infrastructure;

import com.marioparrillamaroto.homemates.core.auth.domain.AuthUserDTO;
import com.marioparrillamaroto.homemates.core.auth.domain.AuthService;
import com.marioparrillamaroto.homemates.shared.domain.BaseException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("${PUBLIC-API-POINT-V0}/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService service;
    @PostMapping("/register")
    public ResponseEntity<AuthUserDTO> register(@RequestBody AuthUserDTO authUserDTO) throws BaseException {
        AuthUserDTO dto = service.register(authUserDTO);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<AuthUserDTO> login(@RequestBody AuthUserDTO authUserDTO) throws BaseException {
        AuthUserDTO dto = service.login(authUserDTO);
        return new ResponseEntity<>(dto, HttpStatus.OK);
    }
}
