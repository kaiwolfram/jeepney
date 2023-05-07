package ui.views.main

import data.createRobohashUrl
import model.*
import java.util.*

data class MainViewModelState(
    val firstColumnSelection: FirstColumnSelection = DirectMessagesSelection,
    val groups: List<Group> = listOf(
        Group(
            id = UUID.randomUUID().toString(),
            name = UUID.randomUUID().toString(),
            about = "coolio",
            admins = listOf(),
            picture = createRobohashUrl(UUID.randomUUID().toString()),
            channels = listOf()
        ),
    ),
    val profile: Profile = Profile(
        name = "Kai",
        about = "I am Kai",
        picture = "https://avatars.githubusercontent.com/u/48265657?v=4"
    ),
    val directMessageChats: List<DirectMessageChat> = listOf(
        DirectMessageChat(
            partner = Profile(name = "Alice", about = "I am Alice", picture = createRobohashUrl("Alice")),
            chat = listOf(
                Message(
                    author = "Alice",
                    picture = createRobohashUrl("Alice"),
                    createdAt = 0L,
                    content = "I am indeed Alice"
                )
            )
        ),
        DirectMessageChat(
            partner = Profile(name = "Alice", about = "I am Alice", picture = createRobohashUrl("Alice")),
            chat = listOf(
                Message(
                    author = "Alice",
                    picture = createRobohashUrl("Alice"),
                    createdAt = 0L,
                    content = "I am indeed Alice"
                )
            )
        ),
        DirectMessageChat(
            partner = Profile(name = "Alice", about = "I am Alice", picture = createRobohashUrl("Alice")),
            chat = listOf(
                Message(
                    author = "Alice",
                    picture = createRobohashUrl("Alice"),
                    createdAt = 0L,
                    content = "I am indeed Alice"
                )
            )
        ),
    )
) {
    fun getSelectedGroupOrNull(): Group? {
        return if (firstColumnSelection is GroupSelection) groups.getOrNull(firstColumnSelection.index)
        else null
    }
}