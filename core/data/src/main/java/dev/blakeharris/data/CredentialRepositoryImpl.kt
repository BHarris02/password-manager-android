package dev.blakeharris.data

import dev.blakeharris.database.credential.CredentialDao
import dev.blakeharris.model.CredentialPreview
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class CredentialRepositoryImpl(
    private val credentialDao: CredentialDao
) : CredentialRepository {

    override suspend fun summaries(): Flow<List<CredentialPreview>> = credentialDao.summaries()
        .map { summaries ->
            summaries.map { it.toPreview() }
        }
}
