package ui.views.main.firstColumn.molecules

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import model.DirectMessages
import model.Feed
import model.FirstColumnSelection
import ui.theme.firstColumnTopPadding
import ui.views.main.firstColumn.atoms.MainIcon
import ui.views.main.firstColumn.atoms.SectionDivider

@Composable
fun StandardSection(
    selection: FirstColumnSelection,
    onFeedClick: () -> Unit,
    onDirectMessagesClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(Modifier.height(firstColumnTopPadding))
        MainIcon(
            onClick = onDirectMessagesClick,
            defaultImagePath = "icon_chat.svg",
            isSelected = selection == DirectMessages
        )
        MainIcon(
            onClick = onFeedClick,
            defaultImagePath = "icon_feed.svg",
            isSelected = selection == Feed
        )
        SectionDivider()
    }
}