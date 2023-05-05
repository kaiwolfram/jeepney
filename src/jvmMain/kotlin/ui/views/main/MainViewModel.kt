package ui.views.main

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import model.Group
import ui.views.main.firstColumn.atoms.DirectMessages
import ui.views.main.firstColumn.atoms.Feed
import ui.views.main.firstColumn.atoms.Groups
import java.util.*

class MainViewModel {
    private val viewModelScope = CoroutineScope(Dispatchers.IO)
    private val viewModelState = MutableStateFlow(MainViewModelState())
    val uiState = viewModelState.stateIn(
        scope = viewModelScope,
        started = SharingStarted.Eagerly,
        initialValue = viewModelState.value
    )

    val onFeedClick: () -> Unit = {
        viewModelState.update {
            it.copy(firstColumnSelection = Feed)
        }
    }

    val onDirectMessagesClick: () -> Unit = {
        viewModelState.update {
            it.copy(firstColumnSelection = DirectMessages)
        }
    }

    val onAddGroupClick: () -> Unit = {
        viewModelState.update {
            it.copy(
                groups = it.groups + Group(
                    id = UUID.randomUUID().toString(),
                    name = UUID.randomUUID().toString(),
                    about = UUID.randomUUID().toString(),
                    admins = listOf(),
                    picture = "https://robohash.org/${UUID.randomUUID()}",
                    channels = listOf()
                )
            )
        }
    }

    val onProfileClick: () -> Unit = {
        // Open modal dialog
    }

    val onGroupClick: (Int) -> Unit = { clickedIndex ->
        viewModelState.update {
            it.copy(firstColumnSelection = Groups(group = it.groups[clickedIndex]))
        }
    }
}