package com.example.demo.domain.block

import org.springframework.stereotype.Service

@Service
class ExampleService(private val exampleProvider: ExampleProvider) {

    fun getExample() = exampleProvider.getExample()
}