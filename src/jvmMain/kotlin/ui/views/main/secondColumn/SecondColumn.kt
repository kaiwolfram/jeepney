package ui.views.main.secondColumn

import androidx.compose.runtime.Composable
import ui.views.main.firstColumn.atoms.DirectMessages
import ui.views.main.firstColumn.atoms.Feed
import ui.views.main.firstColumn.atoms.FirstColumnSelection
import ui.views.main.firstColumn.atoms.Groups
import ui.views.main.secondColumn.organisms.DirectMessagesColumn
import ui.views.main.secondColumn.organisms.FeedColumn
import ui.views.main.secondColumn.organisms.GroupColumn

@Composable
fun SecondColumn(
    firstColumnSelection: FirstColumnSelection,
) {
    when (firstColumnSelection) {
        is DirectMessages -> DirectMessagesColumn()
        is Feed -> FeedColumn()
        is Groups -> GroupColumn(firstColumnSelection.group)
    }
}