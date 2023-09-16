package com.marioparrillamaroto.homemates.core.auth.domain;

import jakarta.persistence.Column;
import lombok.*;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class AuthUserDTO {
    private long id;
    private String username;
    private String name;
    private String surnames;
    private String email;
    private String phonenumber;
    private String dni;
    private String country;
    private String password;
    private String creatorUsername;
}
