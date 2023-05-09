package ui.composables

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow

@Composable
fun SingleLineText(text: String, fontWeight: FontWeight? = null, fontFamily: FontFamily? = null) {
    Text(
        text = text,
        maxLines = 1,
        overflow = TextOverflow.Ellipsis,
        fontWeight = fontWeight,
        fontFamily = fontFamily
    )
}