package dev.blakeharris.database.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dev.blakeharris.database.PasswordManagerDatabase
import dev.blakeharris.database.credential.CredentialDao
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DaoModule {
    @Provides
    @Singleton
    fun provideCredentialDao(db: PasswordManagerDatabase): CredentialDao = db.credentialDao()
}
