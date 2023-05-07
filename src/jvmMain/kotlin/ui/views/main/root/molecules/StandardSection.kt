package ui.views.main.root.molecules

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import model.DirectMessagesSelection
import model.FeedSelection
import model.FirstColumnSelection
import ui.theme.firstColumnTopPadding
import ui.views.main.root.atoms.MainIcon
import ui.views.main.root.atoms.SectionDivider

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
            isSelected = selection == DirectMessagesSelection
        )
        MainIcon(
            onClick = onFeedClick,
            defaultImagePath = "icon_feed.svg",
            isSelected = selection == FeedSelection
        )
        SectionDivider()
    }
}