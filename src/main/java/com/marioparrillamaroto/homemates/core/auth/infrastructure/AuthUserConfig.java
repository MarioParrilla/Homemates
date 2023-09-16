package com.marioparrillamaroto.homemates.core.auth.infrastructure;

import com.marioparrillamaroto.homemates.core.auth.domain.AuthUserRepositoryPort;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AuthUserConfig {
    @Bean
    @Qualifier("JPA-Auth-User-Adapter")
    @Primary
    public AuthUserRepositoryPort jpaAuthUserRepositoryAdapter()  {
        return new JpaAuthUserRepositoryAdapter();
    }

    @Bean
    @Qualifier("Memory-Auth-User-Adapter")
    public AuthUserRepositoryPort memoryAuthUserRepositoryAdapter()  {
        return new MemoryAuthUserRepositoryAdapter();
    }
}
