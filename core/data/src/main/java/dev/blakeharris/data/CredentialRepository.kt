package dev.blakeharris.data

import dev.blakeharris.model.CredentialPreview
import kotlinx.coroutines.flow.Flow

interface CredentialRepository {
    suspend fun summaries(): Flow<List<CredentialPreview>>
}
