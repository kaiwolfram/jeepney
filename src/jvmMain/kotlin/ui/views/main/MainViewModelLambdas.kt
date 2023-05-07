package ui.views.main

data class MainViewModelLambdas(
    val onFeedClick: () -> Unit,
    val onDirectMessagesClick: () -> Unit,
    val onGroupClick: (Int) -> Unit,
    val onAddGroupClick: () -> Unit,
    val onProfileClick: () -> Unit,
)
