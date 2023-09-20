package com.marioparrillamaroto.homemates.core.users.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class UserDTO {
    private long id;
    private String username;
    private String name;
    private String surnames;
    private String email;
    private String phonenumber;
    private UserDNI dni;
    private String country;
    private String password;
    private String creatorUsername;
}
