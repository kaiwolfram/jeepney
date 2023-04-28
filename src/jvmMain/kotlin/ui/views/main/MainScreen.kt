package ui.views.main

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import model.Group
import model.Profile
import ui.views.main.molecules.MainColumn

@Composable
fun MainScreen(profile: Profile, groups: List<Group>) {
    Row(modifier = Modifier.fillMaxSize()) {
        MainColumn(
            profilePicture = profile.picture,
            onProfileClick = {},
            onDirectMessagesClick = {},
            groupPictures = groups.map { it.picture },
            onGroupClick = {},
            onAddGroupClick = {},
        )
    }
}