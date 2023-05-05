package model

data class Group(
    val id: String,
    val name: String,
    val about: String,
    val picture: String,
    val admins: List<String>,
    val channels: List<Channel>,
)
