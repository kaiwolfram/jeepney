package ui.views.main

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ui.views.main.firstColumn.FirstColumn
import ui.views.main.secondColumn.SecondColumn

@Composable
fun MainScreen(
    uiState: MainViewModelState,
    onFeedClick: () -> Unit,
    onDirectMessagesClick: () -> Unit,
    onGroupClick: (Int) -> Unit,
    onAddGroupClick: () -> Unit,
    onProfileClick: () -> Unit,
) {
    Row(modifier = Modifier.fillMaxSize()) {
        FirstColumn(
            firstColumnSelection = uiState.firstColumnSelection,
            onFeedClick = onFeedClick,
            onDirectMessagesClick = onDirectMessagesClick,
            groupPictures = uiState.groups.map { it.picture },
            onGroupClick = onGroupClick,
            onAddGroupClick = onAddGroupClick,
            profilePicture = uiState.profile.picture,
            onProfileClick = onProfileClick,
        )
        SecondColumn(firstColumnSelection = uiState.firstColumnSelection)
    }
}