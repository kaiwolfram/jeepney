package ui.views.main.secondColumn.atoms

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import ui.theme.secondColumnWidth

@Composable
fun SecondColumnStructure(content: @Composable () -> Unit) {
    Column(
        modifier = Modifier.fillMaxHeight().width(secondColumnWidth).background(color = Color.Gray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        content()
    }
}
