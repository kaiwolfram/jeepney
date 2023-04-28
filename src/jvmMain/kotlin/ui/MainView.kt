package ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun MainView(modifier: Modifier) {
    Row(
        modifier = modifier,
    ) {
        LeftColumn(modifier = Modifier.fillMaxHeight().background(color = Color.Yellow))
        Text("2")
    }
}