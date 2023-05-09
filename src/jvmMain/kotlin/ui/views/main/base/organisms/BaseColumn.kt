package ui.views.main.base.organisms

import androidx.compose.runtime.Composable
import model.*
import ui.views.main.base.molecules.DirectMessagesColumn
import ui.views.main.base.molecules.FeedColumn
import ui.views.main.base.molecules.GroupColumn

@Composable
fun BaseColumn(
    baseColumnSelection: BaseColumnSelection
) {
    when (baseColumnSelection) {
        is DirectMessageChats -> DirectMessagesColumn(directMessageChats = baseColumnSelection.directMessageChats)
        is FeedAndFilter -> FeedColumn()
        is SelectedGroup -> GroupColumn(baseColumnSelection.selectedGroup)
        is NothingInBaseColumn -> {}
    }
}