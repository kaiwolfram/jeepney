package ui.views.main.molecules

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import ui.views.main.atoms.MainIcon

@Composable
internal fun GroupSection(
    groupPictures: List<String>,
    onGroupClick: (Int) -> Unit,
    onAddGroupClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        groupPictures.forEachIndexed { i, groupPicture ->
            run {
                MainIcon(picture = groupPicture, onClick = { onGroupClick(i) })
            }
        }
        MainIcon(picture = "https://em-content.zobj.net/thumbs/120/apple/354/plus_2795.png", onClick = onAddGroupClick)
    }
}