package ui.views.main.atoms

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.produceState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.toAwtImage
import androidx.compose.ui.graphics.toPainter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.rememberVectorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import data.loadNetworkImageBitmap
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import ui.theme.*
import java.io.IOException

@Composable
fun MainIcon(
    onClick: () -> Unit,
    defaultImg: ImageVector,
    isSelected: Boolean,
    modifier: Modifier = Modifier,
    picture: String? = null,
    shape: Shape = roundedCorner,
) {
    val realShape = if (isSelected) CircleShape else shape
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
        val imgModifier = modifier
            .padding(
                start = mainIconHorizontalPadding.minus(
                    if (isSelected) mainColumnSelectionIndicatorWidth else 0.dp
                ),
                end = mainIconHorizontalPadding,
                top = mainIconVerticalPadding,
                bottom = mainIconVerticalPadding
            )
            .background(color = MaterialTheme.colors.background, shape = realShape)
            .clip(shape = realShape)
            .clickable(onClick = onClick)
        if (picture != null) {
            AsyncImage(
                load = { loadNetworkImageBitmap(url = picture) },
                defaultImg = defaultImg,
                modifier = imgModifier
            )
        } else {
            FittedImage(
                painter = rememberVectorPainter(defaultImg),
                modifier = imgModifier
            )
        }

    }
}

@Composable
private fun AsyncImage(
    load: suspend () -> ImageBitmap?,
    modifier: Modifier = Modifier,
    defaultImg: ImageVector = Icons.Default.AccountBox
) {
    val bitmap: ImageBitmap? by produceState<ImageBitmap?>(null) {
        value = withContext(Dispatchers.IO) {
            try {
                load()
            } catch (e: IOException) {
                e.printStackTrace()
                null
            }
        }
    }
    FittedImage(
        painter = if (bitmap != null) bitmap!!.toAwtImage().toPainter()
        else rememberVectorPainter(defaultImg),
        modifier = modifier
    )

}

@Composable
private fun FittedImage(painter: Painter, modifier: Modifier = Modifier) {
    Image(
        painter = painter,
        contentDescription = null,
        contentScale = ContentScale.Fit,
        modifier = modifier
    )
}