package ui.views.main.base.organisms

import androidx.compose.runtime.Composable
import model.*
import ui.views.main.base.molecules.DirectMessagesColumn
import ui.views.main.base.molecules.FeedColumn
import ui.views.main.base.molecules.GroupColumn

@Composable
fun BaseColumn(
    baseColumnSelection: BaseColumnSelection,
    onAddDirectMessageChat: () -> Unit
) {
    when (baseColumnSelection) {
        is DirectMessageChats -> DirectMessagesColumn(
            directMessageChats = baseColumnSelection.directMessageChats,
            onAddDirectMessageChat = onAddDirectMessageChat,
        )

        is FeedAndFilter -> FeedColumn()
        is SelectedGroup -> GroupColumn(baseColumnSelection.selectedGroup)
        is NothingInBaseColumn -> {}
    }
}