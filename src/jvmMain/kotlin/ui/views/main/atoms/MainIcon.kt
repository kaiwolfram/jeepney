package ui.views.main.atoms

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.produceState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.toAwtImage
import androidx.compose.ui.graphics.toPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import data.loadNetworkImageBitmap
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import ui.theme.*
import java.io.IOException

@Composable
fun MainIcon(
    onClick: () -> Unit,
    isSelected: Boolean,
    defaultImagePath: String,
    modifier: Modifier = Modifier,
    pictureUrl: String? = null,
) {
    val realShape = if (isSelected) roundedCorner else CircleShape
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
            .fillMaxWidth()
            .aspectRatio(1f)
            .background(color = MaterialTheme.colors.background, shape = realShape)
            .clip(shape = realShape)
            .clickable(onClick = onClick)
        if (pictureUrl != null) {
            AsyncImage(
                load = { loadNetworkImageBitmap(url = pictureUrl) },
                defaultImagePath = defaultImagePath,
                modifier = imgModifier
            )
        } else {
            FittedImage(
                painter = painterResource(defaultImagePath),
                modifier = imgModifier
            )
        }

    }
}

@Composable
private fun AsyncImage(
    load: suspend () -> ImageBitmap?,
    modifier: Modifier = Modifier,
    defaultImagePath: String,
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
        else painterResource(defaultImagePath),
        modifier = modifier
    )
}


@Composable
private fun FittedImage(painter: Painter, modifier: Modifier = Modifier) {
    Image(
        painter = painter,
        contentDescription = null,
        contentScale = ContentScale.Inside,
        modifier = modifier
    )
}