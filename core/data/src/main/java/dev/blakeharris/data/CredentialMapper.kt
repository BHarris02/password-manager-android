package dev.blakeharris.data

import dev.blakeharris.database.credential.CredentialSummary
import dev.blakeharris.model.CredentialPreview

fun CredentialSummary.toPreview() = CredentialPreview(
    id = id,
    name = name,
    lastUpdated = lastUpdated
)
