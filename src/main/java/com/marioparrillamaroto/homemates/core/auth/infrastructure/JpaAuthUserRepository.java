package com.marioparrillamaroto.homemates.core.auth.infrastructure;

import com.marioparrillamaroto.homemates.core.auth.domain.AuthUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JpaAuthUserRepository extends JpaRepository<AuthUserEntity, Long> {
    @Query("SELECT a FROM AuthUserEntity a WHERE username = ?1 AND password = ?2")
    Optional<AuthUserEntity> findByUsernameAndPassword(String username, String password);
    @Query("SELECT a FROM AuthUserEntity a WHERE username = ?1")
    AuthUserEntity findByUsername(String username);
    @Query("SELECT a FROM AuthUserEntity a WHERE password = ?1")
    AuthUserEntity findByPassword(String password);
    @Query("SELECT a FROM AuthUserEntity a WHERE email = ?1")
    AuthUserEntity findByEmail(String email);
    @Query("SELECT a FROM AuthUserEntity a WHERE phonenumber = ?1")
    AuthUserEntity findByPhonenumber(String phonenumber);
    @Query("SELECT a FROM AuthUserEntity a WHERE dni = ?1")
    AuthUserEntity findByDni(String dni);

}
