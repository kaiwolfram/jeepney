package ui.views.main.molecules

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.unit.dp
import data.loadNetworkImageBitmap
import ui.composables.AsyncImage
import ui.roundedCorner

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
        modifier = Modifier.fillMaxHeight().width(70.dp).background(color = Color.LightGray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Spacer(Modifier.height(6.dp))
            MainIcon(picture = profilePicture, onClick = onDirectMessagesClick)
            SectionDivider()
            groupPictures.forEachIndexed { i, groupPicture ->
                run {
                    MainIcon(picture = groupPicture, onClick = { onGroupClick(i) })
                }
            }
            MainIcon(picture = profilePicture, onClick = onAddGroupClick)
        }
        Column(
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SectionDivider()
            MainIcon(picture = profilePicture, onClick = onProfileClick, shape = CircleShape)
        }
    }
}

@Composable
private fun MainIcon(
    picture: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = roundedCorner
) {
    AsyncImage(
        load = { loadNetworkImageBitmap(url = picture) },
        painterFor = { remember { BitmapPainter(it) } },
        modifier = modifier
            .padding(horizontal = 12.dp, vertical = 6.dp)
            .background(color = Color.Gray, shape = shape)
            .clip(shape = shape)
            .clickable(onClick = onClick)
    )
}

@Composable
private fun SectionDivider() {
    Divider(Modifier.padding(vertical = 2.dp).height(2.dp).fillMaxWidth(0.5f))
}