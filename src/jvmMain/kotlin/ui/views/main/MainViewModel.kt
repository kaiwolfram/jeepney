package ui.views.main

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import model.Group
import ui.views.main.atoms.DirectMessages
import ui.views.main.atoms.Feed
import ui.views.main.atoms.GroupSection

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
            it.copy(currentSelection = Feed)
        }
    }

    val onDirectMessagesClick: () -> Unit = {
        viewModelState.update {
            it.copy(currentSelection = DirectMessages)
        }
    }

    val onAddGroupClick: () -> Unit = {
        viewModelState.update {
            it.copy(
                groups = it.groups + Group(
                    name = "Friendly group",
                    about = "friendly",
                    admins = listOf(),
                    picture = "https://robohash.org/${it.groups.size}",
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
            it.copy(currentSelection = GroupSection(index = clickedIndex))
        }
    }
}