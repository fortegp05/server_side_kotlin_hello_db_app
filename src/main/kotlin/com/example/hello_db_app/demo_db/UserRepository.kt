package com.example.hello_db_app.demo_db

import org.springframework.data.repository.CrudRepository

interface UserRepository : CrudRepository<User, Int>