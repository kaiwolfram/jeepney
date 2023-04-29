package ui.views.main.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.unit.dp
import data.loadNetworkImageBitmap
import ui.components.AsyncImage
import ui.roundedCorner

@Composable
internal fun MainIcon(
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
            .background(color = Color.White, shape = shape)
            .clip(shape = shape)
            .clickable(onClick = onClick)
    )
}