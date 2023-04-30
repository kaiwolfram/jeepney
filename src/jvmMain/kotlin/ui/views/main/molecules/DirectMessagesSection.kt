package ui.views.main.molecules

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import ui.theme.mainColumnTopPadding
import ui.views.main.atoms.MainIcon
import ui.views.main.atoms.SectionDivider

@Composable
fun DirectMessagesSection(
    isSelected: Boolean,
    onDirectMessagesClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(Modifier.height(mainColumnTopPadding))
        MainIcon(
            isSelected = isSelected,
            picture = "https://em-content.zobj.net/source/microsoft-teams/337/love-letter_1f48c.png",
            onClick = onDirectMessagesClick
        )
        SectionDivider()
    }
}