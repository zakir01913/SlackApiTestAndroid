package com.zakir.slackapitest.conversations.data.remote

import com.zakir.slackapitest.conversations.domain.model.ChannelModel
import com.zakir.slackapitest.conversations.domain.repository.ConversationsDataSource
import io.reactivex.Flowable
import javax.inject.Inject

class ConversationRemoteDataSource @Inject constructor(private val conversationsApiService: ConversationsApiService) : ConversationsDataSource {

    override fun getChannels(): Flowable<List<ChannelModel>> {
        return conversationsApiService.getChannels().map { channels -> channels.map { ChannelModel(it.id, it.name, it.num_members) } }
    }
}