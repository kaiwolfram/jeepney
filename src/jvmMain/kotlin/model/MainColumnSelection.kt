package model

sealed class MainColumnSelection

object DirectMessagesSection : MainColumnSelection()

class GroupSection(val index: Int) : MainColumnSelection()
