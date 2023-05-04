package ui.views.main

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue

@Composable
fun MainRoute(mainViewModel: MainViewModel) {
    val uiState by mainViewModel.uiState.collectAsState()

    MainScreen(
        uiState = uiState,
        onFeedClick = mainViewModel.onFeedClick,
        onDirectMessagesClick = mainViewModel.onDirectMessagesClick,
        onGroupClick = mainViewModel.onGroupClick,
        onAddGroupClick = mainViewModel.onAddGroupClick,
        onProfileClick = mainViewModel.onProfileClick,
    )
}
