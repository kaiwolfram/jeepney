package ui.views.main.base

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import model.DirectMessageChat
import model.FirstColumnSelection
import model.Group
import ui.views.main.base.organisms.BaseColumn
import ui.views.main.content.MainContent

@Composable
fun MainBase(
    firstColumnSelection: FirstColumnSelection,
    selectedGroup: Group?,
    directMessageChats: List<DirectMessageChat>
) {
    Row(Modifier.fillMaxSize()) {
        BaseColumn(
            // TODO: Better input
            firstColumnSelection = firstColumnSelection,
            selectedGroup,
            directMessageChats
        )
        MainContent()
    }
}