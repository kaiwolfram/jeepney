package model

sealed class FirstColumnSelection

object DirectMessages : FirstColumnSelection()

object Feed : FirstColumnSelection()

class Groups(val index: Int) : FirstColumnSelection()
