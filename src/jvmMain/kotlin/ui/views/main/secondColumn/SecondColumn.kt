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
        is DirectMessages -> DirectMessagesColumn(directMessageChats = directMessageChats)
        is Feed -> FeedColumn()
        is Groups -> selectedGroup?.let { GroupColumn(group = it) }
    }
}