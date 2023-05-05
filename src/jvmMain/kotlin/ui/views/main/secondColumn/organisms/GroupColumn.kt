package ui.views.main.secondColumn.organisms

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import ui.views.main.secondColumn.atoms.SecondColumnStructure

@Composable
fun GroupColumn(groupName: String) {
    SecondColumnStructure {
        Text(groupName)
    }
}