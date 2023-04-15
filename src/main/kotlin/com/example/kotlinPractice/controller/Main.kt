package com.example.kotlinPractice.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.RequestMapping

@RestController
@RequestMapping("/")
class MainController {
    @GetMapping
    fun get(): String {
        return "aaa\n"
    }
}