package ui.views.main.base.atoms

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import ui.composables.SingleLineText
import ui.theme.roundedCorner

@Composable
fun BaseColumnHeader(
    text: String,
    trailingIcon: ImageVector? = null,
    onClickTrailingIcon: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Row(
        modifier = modifier,
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        SingleLineText(
            text = text,
            fontWeight = FontWeight.Bold,
            fontFamily = FontFamily.Monospace,
        )
        trailingIcon?.let {
            Icon(
                imageVector = trailingIcon,
                contentDescription = null,
                modifier = Modifier.clip(roundedCorner).clickable(onClick = onClickTrailingIcon)
            )
        }
    }
}