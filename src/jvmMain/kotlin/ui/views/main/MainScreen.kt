package ui.views.main

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import ui.views.main.base.MainBase
import ui.views.main.root.RootColumn

@Composable
fun MainScreen(
    uiState: MainViewModelState,
    lambdas: MainViewModelLambdas
) {
    Row(Modifier.fillMaxSize()) {
        RootColumn(
            firstColumnSelection = uiState.firstColumnSelection,
            onFeedClick = lambdas.onFeedClick,
            onDirectMessagesClick = lambdas.onDirectMessagesClick,
            groups = uiState.groups,
            onGroupClick = lambdas.onGroupClick,
            onAddGroupClick = lambdas.onAddGroupClick,
            profilePicture = uiState.profile.picture,
            onProfileClick = lambdas.onProfileClick,
        )
        MainBase(uiState.firstColumnSelection, null, listOf())
    }
}