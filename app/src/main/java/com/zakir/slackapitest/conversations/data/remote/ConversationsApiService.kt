package com.zakir.slackapitest.conversations.data.remote

import io.reactivex.Flowable
import retrofit2.http.GET

interface ConversationsApiService {

    @GET("conversations.list")
    fun getChannels() : Flowable<List<Channel>>
}