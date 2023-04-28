package ui

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import ui.views.main.MainRoute
import ui.views.main.MainViewModel

@Composable
fun App() {
    MaterialTheme {
        val mainViewModel = MainViewModel()
        MainRoute(mainViewModel = mainViewModel)
    }
}