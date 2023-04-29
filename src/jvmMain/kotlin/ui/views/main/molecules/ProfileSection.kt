package ui.views.main.molecules

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import ui.views.main.atoms.MainIcon
import ui.views.main.atoms.SectionDivider


@Composable
internal fun ProfileSection(
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
        MainIcon(picture = profilePicture, onClick = onProfileClick, shape = CircleShape)
    }
}