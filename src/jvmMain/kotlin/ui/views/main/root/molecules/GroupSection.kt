package ui.views.main.root.molecules

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.gestures.DraggableState
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import model.Group
import ui.views.main.root.atoms.MainIcon

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun GroupSection(
    groups: List<Group>,
    selectedIndex: Int?,
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
        groups.forEachIndexed { i, group ->
            run {
                MainIcon(
                    isSelected = i == selectedIndex,
                    pictureUrl = group.picture,
                    onClick = { onGroupClick(i) },
                    defaultImagePath = "icon_group.svg",
                )
            }
        }
        MainIcon(
            isSelected = false,
            defaultImagePath = "icon_add.svg",
            onClick = onAddGroupClick,
        )
    }
}