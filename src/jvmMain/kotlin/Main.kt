import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowPlacement
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application
import data.i18n.localizedStrings
import ui.App

fun main() = application {
    Window(
        title = localizedStrings.appName,
        state = WindowState(placement = WindowPlacement.Maximized),
        onCloseRequest = ::exitApplication
    ) {
        App()
    }
}
