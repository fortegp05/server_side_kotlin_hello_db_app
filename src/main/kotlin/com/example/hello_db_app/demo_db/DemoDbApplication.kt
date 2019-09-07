package com.example.hello_db_app.demo_db

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DemoDbApplication

fun main(args: Array<String>) {
	runApplication<DemoDbApplication>(*args)
}
