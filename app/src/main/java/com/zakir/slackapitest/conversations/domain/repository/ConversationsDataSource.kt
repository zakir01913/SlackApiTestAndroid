package com.zakir.slackapitest.conversations.domain.repository

import com.zakir.slackapitest.conversations.domain.model.Channel

interface ConversationsDataSource {
    fun getChannels() : List<Channel>
}