package ui.views.main.base.organisms

import androidx.compose.runtime.Composable
import model.*
import ui.views.main.base.molecules.DirectMessagesColumn
import ui.views.main.base.molecules.FeedColumn
import ui.views.main.base.molecules.GroupColumn

@Composable
fun BaseColumn(
    firstColumnSelection: FirstColumnSelection,
    selectedGroup: Group?,
    directMessageChats: List<DirectMessageChat>
) {
    when (firstColumnSelection) {
        is DirectMessagesSelection -> DirectMessagesColumn(directMessageChats = directMessageChats)
        is FeedSelection -> FeedColumn()
        is GroupSelection -> selectedGroup?.let { GroupColumn(group = it) }
    }
}