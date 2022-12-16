package com.sergio994350.noteskmm.data.note

import com.sergio994350.noteskmm.domain.note.Note
import database.NoteEntity
import kotlinx.datetime.Instant
import kotlinx.datetime.TimeZone
import kotlinx.datetime.toLocalDateTime

fun NoteEntity.toNote(): Note {
    return Note(
        id = id,
        title = title,
        content = content,
        colorHex = colorHex,
        created = Instant.fromEpochMilliseconds(created)
            .toLocalDateTime(TimeZone.currentSystemDefault())
    )
}