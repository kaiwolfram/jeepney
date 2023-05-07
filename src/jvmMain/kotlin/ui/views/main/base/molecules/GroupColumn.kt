package ui.views.main.base.molecules

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import model.Group
import ui.views.main.base.atoms.BaseColumnStructure

@Composable
fun GroupColumn(group: Group) {
    BaseColumnStructure {
        Text(group.name)
        Text(group.about)
        Text(group.picture)
    }
}