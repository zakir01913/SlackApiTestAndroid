package com.zakir.slackapitest.conversations.data.remote

data class GetChannelResponse(val ok: Boolean, val error: String, val channels: List<Channel>)
data class Channel(val id: String, val name: String, val num_members: Int)