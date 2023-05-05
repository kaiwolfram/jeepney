package ui.views.main.secondColumn.organisms

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import model.Group
import ui.views.main.secondColumn.atoms.SecondColumnStructure

@Composable
fun GroupColumn(group: Group) {
    SecondColumnStructure {
        Text(group.name)
        Text(group.about)
        Text(group.picture)
    }
}