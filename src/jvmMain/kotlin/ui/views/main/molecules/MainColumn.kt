package ui.views.main.molecules

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import ui.views.main.molecules.atoms.MainIcon

@Composable
fun MainColumn(
    profilePicture: String,
    onProfileClick: () -> Unit,
    onDirectMessagesClick: () -> Unit,
    groupPictures: List<String>,
    onGroupClick: (Int) -> Unit,
    onAddGroupClick: () -> Unit,
) {
    Column(
        modifier = Modifier.fillMaxHeight().width(50.dp).background(color = Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
    ) {
        MainIcon(picture = profilePicture, onClick = onProfileClick)
        MainIcon(picture = profilePicture, onClick = onDirectMessagesClick)
        Divider()
        groupPictures.forEachIndexed { i, groupPicture ->
            run {
                MainIcon(picture = groupPicture, onClick = { onGroupClick(i) })
            }
        }
        Spacer(modifier = Modifier.height(1.dp))
        MainIcon(picture = profilePicture, onClick = onAddGroupClick)
    }
}