package ui.views.main

import model.Group
import model.Profile
import ui.views.main.atoms.DirectMessages
import ui.views.main.atoms.MainColumnSelection

data class MainViewModelState(
    val currentSelection: MainColumnSelection = DirectMessages,
    val groups: List<Group> = listOf(
        Group(
            name = "Cool group",
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