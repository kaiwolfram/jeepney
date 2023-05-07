package ui.views.main

import data.createRobohashUrl
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.flow.update
import model.DirectMessagesSelection
import model.FeedSelection
import model.Group
import model.GroupSelection
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
            it.copy(firstColumnSelection = FeedSelection)
        }
    }

    val onDirectMessagesClick: () -> Unit = {
        viewModelState.update {
            it.copy(firstColumnSelection = DirectMessagesSelection)
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
            it.copy(firstColumnSelection = GroupSelection(index = clickedIndex))
        }
    }

    fun getLambdas(): MainViewModelLambdas {
        return MainViewModelLambdas(
            onFeedClick = onFeedClick,
            onDirectMessagesClick = onDirectMessagesClick,
            onGroupClick = onGroupClick,
            onAddGroupClick = onAddGroupClick,
            onProfileClick = onProfileClick
        )
    }
}