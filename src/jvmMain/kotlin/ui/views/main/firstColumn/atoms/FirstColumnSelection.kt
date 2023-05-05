package ui.views.main.firstColumn.atoms

import model.Group

sealed class FirstColumnSelection

object DirectMessages : FirstColumnSelection()

object Feed : FirstColumnSelection()

class Groups(val group: Group) : FirstColumnSelection()
