package ui.views.main.organisms

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import model.DirectMessagesSection
import model.GroupSection
import model.MainColumnSelection
import ui.theme.mainColumnWidth
import ui.views.main.molecules.DirectMessagesSection
import ui.views.main.molecules.GroupSection
import ui.views.main.molecules.ProfileSection

@Composable
fun MainColumn(
    currentSelection: MainColumnSelection,
    profilePicture: String,
    onProfileClick: () -> Unit,
    onDirectMessagesClick: () -> Unit,
    groupPictures: List<String>,
    onGroupClick: (Int) -> Unit,
    onAddGroupClick: () -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxHeight().width(mainColumnWidth).background(color = Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        DirectMessagesSection(
            isSelected = currentSelection is DirectMessagesSection,
            onDirectMessagesClick = onDirectMessagesClick
        )
        GroupSection(
            modifier = Modifier.weight(1f).verticalScroll(state = rememberScrollState()),
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
