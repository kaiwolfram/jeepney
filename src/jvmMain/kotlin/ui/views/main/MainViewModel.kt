package ui.views.main

import model.Group
import model.Profile

class MainViewModel {
    val profile: Profile = Profile(
        name = "Kai",
        about = "I am Kai",
        picture = "https://avatars.githubusercontent.com/u/48265657?v=4"
    )
    val groups: List<Group> = listOf(
        Group(
            name = "Cool group",
            about = "coolio",
            admins = listOf(),
            picture = "https://media.tenor.com/XmdYMlOdJZkAAAAM/dancing-bee-bee.gif",
            channels = listOf()
        ),
        Group(
            name = "Friendly group",
            about = "friendly",
            admins = listOf(),
            picture = "https://github.githubassets.com/images/modules/profile/achievements/quickdraw-default--light-medium.png",
            channels = listOf()
        ),
        Group(
            name = "Cool group",
            about = "coolio",
            admins = listOf(),
            picture = "https://github.githubassets.com/images/modules/profile/achievements/starstruck-default--light-medium.png",
            channels = listOf()
        ),
        Group(
            name = "Friendly group",
            about = "friendly",
            admins = listOf(),
            picture = "https://github.githubassets.com/images/modules/profile/achievements/quickdraw-default--light-medium.png",
            channels = listOf()
        ),
    )
}