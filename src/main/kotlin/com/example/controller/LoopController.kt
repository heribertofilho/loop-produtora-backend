package com.example.controller

import com.example.client.InstagramClient
import com.example.model.Feed
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller("/loop")
class LoopController(private val instagramClient: InstagramClient) {

    @Get()
    fun get(): Feed {
        return instagramClient.get().blockingFirst()
    }
}