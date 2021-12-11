package com.pallaw.data.model

import kotlinx.serialization.Serializable

@Serializable
data class Avenger(
    val name: String,
    val description: String,
    val imageUrl: String
)