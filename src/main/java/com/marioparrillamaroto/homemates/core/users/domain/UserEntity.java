package com.marioparrillamaroto.homemates.core.users.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, unique = true)
    private String username;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String surnames;
    @Column(nullable = false, unique = true)
    private String email;
    @Column(nullable = false, unique = true)
    private String phonenumber;
    @Column(nullable = false, unique = true)
    private String dni;
    @Column(nullable = false)
    private String country;
    @Column(nullable = false)
    private String password;
    @Column(nullable = false)
    private Date creationDate;
    @Column(nullable = false)
    private Date updateDate;
    @Column(nullable = false)
    private String creatorUsername;
}
