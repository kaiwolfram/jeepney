package model

data class Message(
    val author: String,
    val picture: String,
    val createdAt: Long,
    val content: String,
)
