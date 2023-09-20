package com.marioparrillamaroto.homemates.core.users.infrastructure;

import com.marioparrillamaroto.homemates.core.users.domain.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaUserRepository extends JpaRepository<UserEntity, Long> {
}
