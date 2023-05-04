package ui.views.main.organisms

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import ui.theme.mainColumnWidth
import ui.views.main.atoms.GroupSection
import ui.views.main.atoms.MainColumnSelection
import ui.views.main.molecules.GroupSection
import ui.views.main.molecules.ProfileSection
import ui.views.main.molecules.StandardSection

@Composable
fun MainColumn(
    currentSelection: MainColumnSelection,
    onFeedClick: () -> Unit,
    onDirectMessagesClick: () -> Unit,
    groupPictures: List<String>,
    onGroupClick: (Int) -> Unit,
    onAddGroupClick: () -> Unit,
    profilePicture: String,
    onProfileClick: () -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxHeight().width(mainColumnWidth).background(color = Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        StandardSection(
            selection = currentSelection,
            onFeedClick = onFeedClick,
            onDirectMessagesClick = onDirectMessagesClick
        )
        GroupSection(
            modifier = Modifier.weight(1f),
            selectedIndex = if (currentSelection is GroupSection) currentSelection.index else null,
            groupPictures = groupPictures,
            onGroupClick = onGroupClick,
            onAddGroupClick = onAddGroupClick
        )
        ProfileSection(
            profilePicture = profilePicture,
            onProfileClick = onProfileClick
        )
    }
}
