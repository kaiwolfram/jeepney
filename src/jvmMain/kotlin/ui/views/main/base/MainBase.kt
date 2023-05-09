package ui.views.main.base

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import model.BaseColumnSelection
import ui.views.main.base.organisms.BaseColumn
import ui.views.main.content.MainContent

@Composable
fun MainBase(
    baseColumnSelection: BaseColumnSelection
) {
    Row(Modifier.fillMaxSize()) {
        BaseColumn(baseColumnSelection = baseColumnSelection)
        MainContent()
    }
}