package com.zakir.slackapitest.conversations.domain.repository

import com.zakir.slackapitest.conversations.domain.model.ChannelModel
import io.reactivex.Flowable
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ConversationsRepository @Inject constructor(private val conversationsDataSource: ConversationsDataSource) {

    fun getChannels() : Flowable<List<ChannelModel>>  = conversationsDataSource.getChannels()
}