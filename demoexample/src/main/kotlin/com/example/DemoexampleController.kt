package com.example

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/api")
class DemoexampleController {

    @Get("/")
    fun hello(): String {
        return "Hello Micronaut"
    }
}

