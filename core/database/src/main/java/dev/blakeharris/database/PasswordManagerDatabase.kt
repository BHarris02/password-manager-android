package dev.blakeharris.database

import androidx.room3.Database
import androidx.room3.RoomDatabase
import dev.blakeharris.database.credential.CredentialDao
import dev.blakeharris.database.credential.CredentialEntity

@Database(
    entities = [CredentialEntity::class],
    version = 1,
    exportSchema = true
)
abstract class PasswordManagerDatabase : RoomDatabase() {
    abstract fun credentialDao(): CredentialDao
}
