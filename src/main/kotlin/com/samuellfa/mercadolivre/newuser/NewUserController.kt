package com.samuellfa.mercadolivre.newuser

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
class NewUserController {

    @PostMapping("/users")
    fun create(@RequestBody @Valid request: NewUserRequest) : String {
        return "ok"
    }
}