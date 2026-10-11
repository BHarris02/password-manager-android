package dev.blakeharris.database.di

import android.content.Context
import androidx.room3.Room
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import dev.blakeharris.database.PasswordManagerDatabase
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {
    @Provides
    @Singleton
    fun provideAppDatabase(@ApplicationContext ctx: Context): PasswordManagerDatabase =
        Room.databaseBuilder(
            context = ctx,
            klass = PasswordManagerDatabase::class.java,
            name = "passwordmanager.db"
        ).build()
}
