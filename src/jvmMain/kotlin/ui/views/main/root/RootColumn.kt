package ui.views.main.root

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import model.Group
import model.GroupSelectionIndex
import model.RootColumnSelection
import ui.theme.firstColumnWidth
import ui.views.main.root.molecules.GroupSection
import ui.views.main.root.molecules.ProfileSection
import ui.views.main.root.molecules.StandardSection

@Composable
fun RootColumn(
    rootColumnSelection: RootColumnSelection,
    onFeedClick: () -> Unit,
    onDirectMessagesClick: () -> Unit,
    groups: List<Group>,
    onGroupClick: (Int) -> Unit,
    onAddGroupClick: () -> Unit,
    profilePicture: String,
    onProfileClick: () -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxHeight().width(firstColumnWidth).background(color = Color.Gray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        StandardSection(
            rootColumnSelection = rootColumnSelection,
            onFeedClick = onFeedClick,
            onDirectMessagesClick = onDirectMessagesClick
        )
        GroupSection(
            modifier = Modifier.weight(1f),
            groups = groups,
            selectedIndex = if (rootColumnSelection is GroupSelectionIndex) rootColumnSelection.index else null,
            onGroupClick = onGroupClick,
            onAddGroupClick = onAddGroupClick
        )
        ProfileSection(
            profilePicture = profilePicture,
            onProfileClick = onProfileClick
        )
    }
}