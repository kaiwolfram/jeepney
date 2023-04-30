package ui.views.main

import androidx.compose.runtime.Composable

@Composable
fun MainRoute(mainViewModel: MainViewModel) {
    MainScreen(
        currentSelection = mainViewModel.currentSelection,
        profile = mainViewModel.profile,
        groups = mainViewModel.groups
    )
}
