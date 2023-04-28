package model

data class Channel(
    val category: String?,
    val members: List<String>?,
    val mdi: String,
    val messages: List<Message>
)
