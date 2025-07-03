package com.ideasapp.globallifeplaner.domain.entity

import androidx.compose.foundation.MutatePriority

data class PlanEvent(
    val eventName: String = "",
    val eventDescription: String = "",
    val condition: String = "",
    // val condition: String = "", // TODO make lambda here
    val isHighPriority: Boolean = false,
    val isDone: Boolean = false,
) {}