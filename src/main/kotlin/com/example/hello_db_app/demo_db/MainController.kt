package com.example.hello_db_app.demo_db

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class MainController {

    @Autowired
    lateinit var userRepository : UserRepository

    @PostMapping("/add")
    fun addNewUser (@RequestParam name: String): String {
        userRepository.save(User(0, name))
        return "Saved"
    }

    @GetMapping("/all")
    fun getAllUsers(): Iterable<User>? {
        return userRepository.findAll()
    }

    @PostMapping("/update")
    fun updateUser (@RequestParam id: Int, name: String): String {
        userRepository.save(User(id, name))
        return "Updated"
    }

    @PostMapping("/delete")
    fun deleteUser (@RequestParam id: Int): String {
        if (userRepository.existsById(id) == true) {
            userRepository.deleteById(id)
            return "Deleted"
        } else
            return "Non User"
    }
}