package ui.views.main

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember

@Composable
fun MainRoute(mainViewModel: MainViewModel) {
    val uiState by mainViewModel.uiState.collectAsState()
    val lambdas = remember { mainViewModel.getLambdas() }

    MainScreen(
        uiState = uiState,
        lambdas = lambdas
    )
}
