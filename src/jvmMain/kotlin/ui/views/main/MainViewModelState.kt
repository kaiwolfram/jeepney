package ui.views.main

import model.Group
import model.Profile
import ui.views.main.firstColumn.atoms.DirectMessages
import ui.views.main.firstColumn.atoms.FirstColumnSelection
import java.util.*

data class MainViewModelState(
    val firstColumnSelection: FirstColumnSelection = DirectMessages,
    val groups: List<Group> = listOf(
        Group(
            id = UUID.randomUUID().toString(),
            name = UUID.randomUUID().toString(),
            about = "coolio",
            admins = listOf(),
            picture = "https://robohash.org/init",
            channels = listOf()
        ),
    ),
    val profile: Profile = Profile(
        name = "Kai",
        about = "I am Kai",
        picture = "https://avatars.githubusercontent.com/u/48265657?v=4"
    )
)