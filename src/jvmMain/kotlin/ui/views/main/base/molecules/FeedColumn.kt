package ui.views.main.base.molecules

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import data.i18n.localizedStrings
import ui.views.main.base.atoms.BaseColumnStructure

@Composable
fun FeedColumn() {
    BaseColumnStructure {
        Text(localizedStrings.feed)
    }
}