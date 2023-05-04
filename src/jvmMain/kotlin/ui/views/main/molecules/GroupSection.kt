package ui.views.main.molecules

import androidx.compose.foundation.*
import androidx.compose.foundation.gestures.DraggableState
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import ui.views.main.atoms.MainIcon

@OptIn(ExperimentalFoundationApi::class)
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
                MainIcon(
                    isSelected = i == selectedIndex,
                    picture = groupPicture,
                    onClick = { onGroupClick(i) },
                    defaultImg = Icons.Default.AccountBox,
                )
            }
        }
        Image(
            imageVector = Icons.Default.Add,
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = Modifier.onClick { onAddGroupClick() }
        )
    }
}