package data.i18n

import data.i18n.translations.DeStrings
import data.i18n.translations.EnStrings
import data.i18n.translations.EsStrings
import java.util.*

val localizedStrings: I18nStrings = when (Locale.getDefault().language) {
    "en" -> EnStrings
    "de" -> DeStrings
    "es" -> EsStrings
    else -> EnStrings
}