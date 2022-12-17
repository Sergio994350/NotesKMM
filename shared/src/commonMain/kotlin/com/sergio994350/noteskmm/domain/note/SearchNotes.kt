package com.sergio994350.noteskmm.domain.note

import com.sergio994350.noteskmm.domain.time.DateTimeUtil

class SearchNotes {

    fun execute(notes: List<Note>, query: String): List<Note> {
        if(query.isBlank()) {
            return notes
        }
        return notes.filter {
            it.title.trim().lowercase().contains(query.lowercase()) ||
                    it.content.trim().lowercase().contains(query.lowercase())
        }.sortedBy { DateTimeUtil.toEpochMillis(it.created) }
    }
}