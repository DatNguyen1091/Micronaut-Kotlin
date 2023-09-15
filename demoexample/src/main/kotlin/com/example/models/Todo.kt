package com.example.models

import io.micronaut.core.annotation.Introspected
import io.micronaut.serde.annotation.Serdeable

@Introspected
@Serdeable
data class Todo(
    var id: Int,
    var product: String?,
    var price: Double,
    var isComplete: Boolean
)