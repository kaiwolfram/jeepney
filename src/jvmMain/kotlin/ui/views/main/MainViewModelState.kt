package ui.views.main

import model.DirectMessagesSection
import model.Group
import model.MainColumnSelection
import model.Profile

data class MainViewModelState(
    val currentSelection: MainColumnSelection = DirectMessagesSection,
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