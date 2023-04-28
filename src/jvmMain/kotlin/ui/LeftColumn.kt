package ui

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun LeftColumn(modifier: Modifier) {
    Column(
        modifier = modifier,
    ) {
        Text("1")
        Text("2")
        Text("3")
        Text("4")
        Text("5")
    }
}