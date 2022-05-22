package com.demoproject.demo.controllers

import com.demoproject.demo.User
import com.demoproject.demo.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("user")
class UserController(@Autowired val userRepository: UserRepository) {

    @GetMapping("/all")
    fun listAllUsers(): List<User> {
        val user1 =
            User(id = UUID.randomUUID(), firstName = "Martijn", lastName = "Huizenga")

        val user2 = user1.copy(id = UUID.randomUUID(), firstName = "Mathijs", lastName = "Groothuis")

        return listOf(user1, user2)
    }

    @PostMapping("/addUser")
    fun createUser(@RequestBody user: User) {
        userRepository.save(user)
    }
}