package com.starterz.starterzservicescore.repository

import com.starterz.starterzservicescore.entity.User
import org.springframework.data.r2dbc.repository.R2dbcRepository
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono

@Repository
interface UserRepository : R2dbcRepository<User, Long> {
    fun findByEmail(email: String): Mono<User>
}