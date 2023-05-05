package model

data class DirectMessageChat(
    val partner: Profile,
    val chat: List<Message>
)