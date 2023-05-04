package ui.views.main.atoms

sealed class MainColumnSelection

object DirectMessages : MainColumnSelection()

object Feed : MainColumnSelection()

class GroupSection(val index: Int) : MainColumnSelection()
