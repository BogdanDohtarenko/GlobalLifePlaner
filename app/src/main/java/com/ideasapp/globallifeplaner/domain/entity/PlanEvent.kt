package com.ideasapp.globallifeplaner.domain.entity

import androidx.compose.foundation.MutatePriority

data class PlanEvent(
    val eventName: String = "",
    val eventDescription: String = "",
    val condition: String = "",
    // val condition: String = "", // TODO make lambda here
    // 3 triggers - weather data previous events
    val isHighPriority: Boolean = false,
    val isDone: Boolean = false,
) {}