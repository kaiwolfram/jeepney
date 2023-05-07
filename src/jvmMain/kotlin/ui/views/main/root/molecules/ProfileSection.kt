package ui.views.main.root.molecules

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import ui.views.main.root.atoms.MainIcon
import ui.views.main.root.atoms.SectionDivider


@Composable
fun ProfileSection(
    profilePicture: String,
    onProfileClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Bottom,
    ) {
        SectionDivider()
        MainIcon(
            pictureUrl = profilePicture,
            onClick = onProfileClick,
            defaultImagePath = "icon_person.svg",
            isSelected = false
        )
    }
}