package ui.views.main.molecules

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.onClick
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MailOutline
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import ui.theme.mainColumnTopPadding
import ui.views.main.atoms.SectionDivider

@OptIn(ExperimentalFoundationApi::class)
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
        Image(
            imageVector = Icons.Default.MailOutline,
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier.onClick { onDirectMessagesClick() }
        )
        SectionDivider()
    }
}