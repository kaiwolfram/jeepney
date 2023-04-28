import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import data.i18n.localizedStrings
import ui.App

fun main() = application {
    Window(
        title = localizedStrings.appName,
        onCloseRequest = ::exitApplication
    ) {
        App()
    }
}
