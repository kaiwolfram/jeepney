package ui.views.main.molecules.atoms

import androidx.compose.foundation.clickable
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MainIcon(picture: String, onClick: () -> Unit) {
    Text(picture.take(10), Modifier.clickable { onClick() })
}