package com.example.client

import com.example.model.Feed
import io.micronaut.http.annotation.Get
import io.micronaut.http.client.annotation.Client
import io.reactivex.Flowable

@Client("https://www.instagram.com/loop.produtora/?__a=1")
interface InstagramClient {

    @Get()
    fun get(): Flowable<Feed>
}