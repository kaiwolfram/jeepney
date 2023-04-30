package ui

import androidx.compose.runtime.Composable
import ui.theme.JeepneyTheme
import ui.views.main.MainRoute
import ui.views.main.MainViewModel

@Composable
fun App() {
    JeepneyTheme {
        val mainViewModel = MainViewModel()
        MainRoute(mainViewModel = mainViewModel)
    }
}