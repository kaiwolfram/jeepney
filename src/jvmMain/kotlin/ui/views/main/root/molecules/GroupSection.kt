package ui.views.main.root.molecules

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import model.Group
import ui.views.main.root.atoms.MainIcon

@Composable
fun GroupSection(
    groups: List<Group>,
    selectedIndex: Int?,
    onGroupClick: (Int) -> Unit,
    onAddGroupClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        itemsIndexed(groups) { i, group ->
            run {
                MainIcon(
                    isSelected = i == selectedIndex,
                    pictureUrl = group.picture,
                    onClick = { onGroupClick(i) },
                    defaultImagePath = "icon_group.svg",
                )
            }
        }
        item {
            MainIcon(
                isSelected = false,
                defaultImagePath = "icon_add.svg",
                onClick = onAddGroupClick,
            )
        }
    }
}