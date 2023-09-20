package com.marioparrillamaroto.homemates.core.auth.domain;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class AuthUserDNI {
    private String numbers;
    private String letter;
}
