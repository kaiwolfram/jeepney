package model

sealed class BaseColumnSelection

class DirectMessageChats(val directMessageChats: List<DirectMessageChat>) : BaseColumnSelection()

class FeedAndFilter(val filterPlaceholder: Int, val feed: List<Message>) : BaseColumnSelection()

class SelectedGroup(val selectedGroup: Group) : BaseColumnSelection()

object NothingInBaseColumn : BaseColumnSelection()