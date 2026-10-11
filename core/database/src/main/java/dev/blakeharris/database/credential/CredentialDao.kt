package dev.blakeharris.database.credential

import androidx.room3.Dao
import androidx.room3.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface CredentialDao {
    @Query("SELECT id, name, lastUpdated FROM credentials ORDER BY name COLLATE NOCASE ASC")
    fun summaries(): Flow<List<CredentialSummary>>
}
