package com.example.demo.api.block

import com.example.demo.domain.block.ExampleService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class ExampleEndpoint(private val exampleService: ExampleService) {

    @GetMapping
    fun getExample(): ResponseEntity<String> = ResponseEntity.ok(exampleService.getExample())
}