package com.sergio994350.noteskmm.domain.note

import com.sergio994350.noteskmm.presentation.BabyBlueHex
import com.sergio994350.noteskmm.presentation.LightGreenHex
import com.sergio994350.noteskmm.presentation.RedOrangeHex
import com.sergio994350.noteskmm.presentation.RedPinkHex
import com.sergio994350.noteskmm.presentation.VioletHex
import kotlinx.datetime.LocalDateTime

data class Note(
    val id: Long?,
    val title: String,
    val content: String,
    val colorHex: Long,
    val created: LocalDateTime
) {
    companion object {
        private val colors = listOf(RedOrangeHex, RedPinkHex, BabyBlueHex, VioletHex, LightGreenHex)

        fun generateRandomColor() = colors.random()
    }
}
