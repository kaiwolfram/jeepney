package ui.views.main.firstColumn

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
import ui.views.main.firstColumn.atoms.FirstColumnSelection
import ui.views.main.firstColumn.atoms.Groups
import ui.views.main.firstColumn.molecules.GroupSection
import ui.views.main.firstColumn.molecules.ProfileSection
import ui.views.main.firstColumn.molecules.StandardSection

@Composable
fun FirstColumn(
    firstColumnSelection: FirstColumnSelection,
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
            selection = firstColumnSelection,
            onFeedClick = onFeedClick,
            onDirectMessagesClick = onDirectMessagesClick
        )
        GroupSection(
            modifier = Modifier.weight(1f),
            selectedIndex = if (firstColumnSelection is Groups) firstColumnSelection.index else null,
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