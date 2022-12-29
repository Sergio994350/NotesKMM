package com.sergio994350.noteskmm.android.di

import android.app.Application
import com.sergio994350.noteskmm.data.local.DatabaseDriverFactory
import com.sergio994350.noteskmm.data.note.SqlDelightNoteDataSource
import com.sergio994350.noteskmm.database.NoteDatabase
import com.sergio994350.noteskmm.domain.note.NoteDataSource
import com.squareup.sqldelight.db.SqlDriver
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun providesSqlDriver(app: Application): SqlDriver {
        return DatabaseDriverFactory(app).createDriver()
    }

    @Provides
    @Singleton
    fun providesNoteDataSource(driver: SqlDriver): NoteDataSource {
        return SqlDelightNoteDataSource(NoteDatabase(driver))
    }
}