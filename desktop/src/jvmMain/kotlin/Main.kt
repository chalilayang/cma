import com.chalilayang.common.App
import androidx.compose.material.MaterialTheme
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(title = "小仙女", onCloseRequest = ::exitApplication) {
        MaterialTheme {
            App()
        }
    }
}