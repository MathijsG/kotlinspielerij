package com.demoproject.demo

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Service
import java.util.*

@Service
interface UserRepository: JpaRepository<User, UUID>
