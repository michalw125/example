package com.example.demo.adapter.accountservice

import com.example.demo.domain.block.ExampleProvider
import org.springframework.stereotype.Component

@Component
class ExampleApi(private val exampleRestApi: ExampleRestApi) : ExampleProvider {

    override fun getExample(): String = exampleRestApi.getExample()
}