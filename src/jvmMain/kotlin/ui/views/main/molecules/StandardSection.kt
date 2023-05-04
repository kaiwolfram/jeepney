package ui.views.main.molecules

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import ui.theme.mainColumnTopPadding
import ui.views.main.atoms.*

@Composable
fun StandardSection(
    selection: MainColumnSelection,
    onFeedClick: () -> Unit,
    onDirectMessagesClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(Modifier.height(mainColumnTopPadding))
        MainIcon(
            onClick = onDirectMessagesClick,
            defaultImg = Icons.Default.MailOutline,
            isSelected = selection == DirectMessages
        )
        MainIcon(
            onClick = onFeedClick,
            defaultImg = Icons.Default.Favorite,
            isSelected = selection == Feed
        )
        SectionDivider()
    }
}