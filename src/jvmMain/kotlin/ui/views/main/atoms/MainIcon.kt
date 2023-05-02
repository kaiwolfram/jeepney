package ui.views.main.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.BitmapPainter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import data.loadNetworkImageBitmap
import ui.components.AsyncImage
import ui.theme.*

@Composable
fun MainIcon(
    picture: String,
    onClick: () -> Unit,
    defaultImg: ImageVector,
    modifier: Modifier = Modifier,
    isSelected: Boolean = false,
    shape: Shape = roundedCorner,
) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        if (isSelected) {
            Box(
                modifier = Modifier.height(mainColumnSelectionIndicatorHeight)
                    .width(mainColumnSelectionIndicatorWidth)
                    .padding(vertical = small)
                    .clip(RoundedCornerShape(topEndPercent = 100, bottomEndPercent = 100))
                    .background(MaterialTheme.colors.background)
            )
        }
        AsyncImage(
            load = { loadNetworkImageBitmap(url = picture) },
            painterFor = { remember { BitmapPainter(it) } },
            defaultImg = defaultImg,
            modifier = modifier
                .padding(
                    start = mainIconHorizontalPadding.minus(
                        if (isSelected) mainColumnSelectionIndicatorWidth else 0.dp
                    ),
                    end = mainIconHorizontalPadding,
                    top = mainIconVerticalPadding,
                    bottom = mainIconVerticalPadding
                )
                .background(color = MaterialTheme.colors.background, shape = shape)
                .clip(shape = shape)
                .clickable(onClick = onClick)
        )
    }
}