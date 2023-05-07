package model

sealed class FirstColumnSelection

object DirectMessagesSelection : FirstColumnSelection()

object FeedSelection : FirstColumnSelection()

class GroupSelection(val index: Int) : FirstColumnSelection()
