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
import model.FirstColumnSelection
import model.Group
import model.Groups
import ui.theme.firstColumnWidth
import ui.views.main.firstColumn.molecules.GroupSection
import ui.views.main.firstColumn.molecules.ProfileSection
import ui.views.main.firstColumn.molecules.StandardSection

@Composable
fun FirstColumn(
    firstColumnSelection: FirstColumnSelection,
    onFeedClick: () -> Unit,
    onDirectMessagesClick: () -> Unit,
    groups: List<Group>,
    onGroupClick: (Int) -> Unit,
    onAddGroupClick: () -> Unit,
    profilePicture: String,
    onProfileClick: () -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxHeight().width(firstColumnWidth).background(color = Color.LightGray),
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
            groups = groups,
            selectedIndex = if (firstColumnSelection is Groups) firstColumnSelection.index else null,
            onGroupClick = onGroupClick,
            onAddGroupClick = onAddGroupClick
        )
        ProfileSection(
            profilePicture = profilePicture,
            onProfileClick = onProfileClick
        )
    }
}
