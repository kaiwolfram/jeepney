package ui.views.main.secondColumn.organisms

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import data.i18n.localizedStrings
import model.DirectMessageChat
import ui.views.main.secondColumn.atoms.SecondColumnStructure

@Composable
fun DirectMessagesColumn(directMessageChats: List<DirectMessageChat>) {
    SecondColumnStructure {
        Text(localizedStrings.directMessages)
    }
}