package com.zakir.slackapitest.di.component

import com.zakir.slackapitest.conversations.di.module.ConversationsModule
import com.zakir.slackapitest.conversations.domain.repository.ConversationsRepository
import dagger.Component
import javax.inject.Singleton


@Singleton
@Component(modules = [ConversationsModule::class])
interface SlackApiTestApplicationComponent {

    fun conversationsRepository() : ConversationsRepository
}