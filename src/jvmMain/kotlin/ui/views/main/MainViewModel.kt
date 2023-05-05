package ui.views.main

import data.createRobohashUrl
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import model.DirectMessages
import model.Feed
import model.Group
import model.Groups
import java.util.*

class MainViewModel {
    private val viewModelScope = CoroutineScope(Dispatchers.IO)
    private val viewModelState = MutableStateFlow(MainViewModelState())
    val uiState = viewModelState.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(),
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
                    picture = createRobohashUrl(UUID.randomUUID().toString()),
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
            it.copy(firstColumnSelection = Groups(index = clickedIndex))
        }
    }
}