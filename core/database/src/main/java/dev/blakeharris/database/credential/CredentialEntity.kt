package dev.blakeharris.database.credential

import androidx.room3.Entity
import androidx.room3.PrimaryKey

@Entity(tableName = "credentials")
data class CredentialEntity(
    @PrimaryKey val id: String,
    val name: String,
    val username: String?,
    val email: String?,
    val password: String,
    val servicePin: String?,
    val twoFactorEnabled: Boolean,
    val notes: String?,
    val createdAt: Long,
    val lastUpdated: Long
)
