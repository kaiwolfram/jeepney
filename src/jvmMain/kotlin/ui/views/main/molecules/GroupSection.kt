package ui.views.main.molecules

import androidx.compose.foundation.gestures.DraggableState
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import ui.views.main.atoms.MainIcon

@Composable
fun GroupSection(
    selectedIndex: Int?,
    groupPictures: List<String>,
    onGroupClick: (Int) -> Unit,
    onAddGroupClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    val scrollState = rememberScrollState(0)
    Column(
        modifier = modifier
            .verticalScroll(state = scrollState)
            .draggable(
                state = DraggableState { scrollState.dispatchRawDelta(it.unaryMinus()) },
                orientation = Orientation.Vertical
            ),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        groupPictures.forEachIndexed { i, groupPicture ->
            run {
                MainIcon(isSelected = i == selectedIndex, picture = groupPicture, onClick = { onGroupClick(i) })
            }
        }
        MainIcon(picture = "https://em-content.zobj.net/thumbs/120/apple/354/plus_2795.png", onClick = onAddGroupClick)
    }
}