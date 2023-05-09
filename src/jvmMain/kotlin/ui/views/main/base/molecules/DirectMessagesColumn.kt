package ui.views.main.base.molecules

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import data.i18n.localizedStrings
import model.DirectMessageChat
import ui.theme.*
import ui.views.main.base.atoms.BaseColumnHeader
import ui.views.main.base.atoms.BaseColumnStructure

@Composable
fun DirectMessagesColumn(
    directMessageChats: List<DirectMessageChat>,
    onAddDirectMessageChat: () -> Unit
) {
    BaseColumnStructure {
        BaseColumnHeader(
            text = localizedStrings.directMessages,
            trailingIcon = Icons.Default.Add,
            onClickTrailingIcon = onAddDirectMessageChat,
            modifier = Modifier.fillMaxWidth()
                .padding(
                    start = baseColumnHeaderStartPadding,
                    end = baseColumnHeaderEndPadding,
                    top = baseColumnTopPadding,
                    bottom = baseColumnHeaderVerticalPadding
                )
        )
        Divider(Modifier.fillMaxWidth().height(tiny))
        LazyColumn {
            items(directMessageChats) {
                Text(it.partner.name)
            }
        }
    }
}