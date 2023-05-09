package model

sealed class RootColumnSelection

object DirectMessagesSelection : RootColumnSelection()

object FeedSelection : RootColumnSelection()

class GroupSelectionIndex(val index: Int) : RootColumnSelection()