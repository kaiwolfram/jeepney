package ui.views.main.secondColumn

import androidx.compose.runtime.Composable
import model.*
import ui.views.main.secondColumn.organisms.DirectMessagesColumn
import ui.views.main.secondColumn.organisms.FeedColumn
import ui.views.main.secondColumn.organisms.GroupColumn

@Composable
fun SecondColumn(
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