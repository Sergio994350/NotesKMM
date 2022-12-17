package com.sergio994350.noteskmm.android.note_list

import com.sergio994350.noteskmm.domain.note.Note

data class NoteListState(
    val notes: List<Note> = emptyList(),
    val searchText: String = "",
    val isSearchActive: Boolean = false
)
