package com.zakir.slackapitest.conversations.di.module

import com.zakir.slackapitest.conversations.data.remote.ConversationRemoteDataSource
import com.zakir.slackapitest.conversations.data.remote.ConversationsApiService
import com.zakir.slackapitest.conversations.domain.repository.ConversationsDataSource
import com.zakir.slackapitest.di.module.NetworkModule
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton

@Module(includes = [NetworkModule::class])
class ConversationsModule {

    @Provides
    @Singleton
    fun conversationsApiService(retrofit: Retrofit) : ConversationsApiService {
        return retrofit.create(ConversationsApiService::class.java)
    }

    @Singleton
    @Provides
    fun conversationsDataSource(conversationsApiService: ConversationsApiService) : ConversationsDataSource = ConversationRemoteDataSource(conversationsApiService)
}