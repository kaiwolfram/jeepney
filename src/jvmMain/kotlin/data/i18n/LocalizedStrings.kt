package data.i18n

import java.util.*

val localizedStrings: I18nStrings = when (Locale.getDefault().language) {
    "en" -> EnStrings
    "de" -> DeStrings
    "es" -> EsStrings
    else -> EnStrings
}