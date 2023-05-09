package ui.theme

import androidx.compose.ui.unit.dp

/**
 * 1 dp
 */
val dot = 1.dp

/**
 * 2 dp
 */
val tiny = 2.dp

/**
 * 4 dp
 */
val small = 4.dp

/**
 * 8 dp
 */
val medium = 8.dp

/**
 * 16 dp
 */
val large = 16.dp

val mainIconHorizontalPadding = 8.dp
val mainIconVerticalPadding = mainIconHorizontalPadding.div(2)

val rootColumnWidth = 55.dp
val rootColumnTopPadding = mainIconVerticalPadding

val rootColumnSelectionIndicatorHeight = rootColumnWidth.times(0.6f)
val rootColumnSelectionIndicatorWidth = 3.dp

val baseColumnWidth = rootColumnWidth.times(4)
val baseColumnTopPadding = rootColumnTopPadding.times(2)

val baseColumnHeaderEndPadding = mainIconHorizontalPadding
val baseColumnHeaderStartPadding = baseColumnHeaderEndPadding.times(2)
val baseColumnHeaderVerticalPadding = mainIconVerticalPadding.times(2)
