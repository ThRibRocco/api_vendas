package com.api_vendinha.api.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class Welcome {

    @GetMapping("/welcome")
    fun welcome(): String {
        return "Ola mundo!.."
    }

    @GetMapping("/media")
    fun media(): Double {
        val nota1: Double = 5.2
        val not2: Double = 4.2
        val not3: Double = 6.2

        val media: Double = (nota1 + not2 + not3) / 3
        return media
    }

    @GetMapping("/nome/{nome}")
    fun nome(@PathVariable nome: String): String {
        return nome
    }

    @GetMapping("/nome2")
    fun nome2(@RequestParam nome: String): String {
        return nome
    }
}
