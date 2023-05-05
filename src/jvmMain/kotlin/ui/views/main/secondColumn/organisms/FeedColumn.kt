package ui.views.main.secondColumn.organisms

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import data.i18n.localizedStrings
import ui.views.main.secondColumn.atoms.SecondColumnStructure

@Composable
fun FeedColumn() {
    SecondColumnStructure {
        Text(localizedStrings.feed)
    }
}