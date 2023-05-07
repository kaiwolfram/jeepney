package ui.views.main.root.atoms

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ui.theme.tiny

@Composable
fun SectionDivider() {
    Divider(Modifier.padding(vertical = tiny).height(tiny).fillMaxWidth(0.5f))
}