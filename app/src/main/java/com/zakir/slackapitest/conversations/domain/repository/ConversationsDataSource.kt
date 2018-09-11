package com.zakir.slackapitest.conversations.domain.repository

import com.zakir.slackapitest.conversations.domain.model.ChannelModel
import io.reactivex.Flowable

interface ConversationsDataSource {
    fun getChannels() : Flowable<List<ChannelModel>>
}