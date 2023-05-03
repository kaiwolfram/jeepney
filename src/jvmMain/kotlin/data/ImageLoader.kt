package data

import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.res.loadImageBitmap
import java.net.SocketException
import java.net.URL


fun loadNetworkImageBitmap(url: String): ImageBitmap? {
    return try {
        URL(url).openStream().buffered().use(::loadImageBitmap)
    } catch (socketException: SocketException) {
        null
    } catch (exception: Exception) {
        null
    }
}
