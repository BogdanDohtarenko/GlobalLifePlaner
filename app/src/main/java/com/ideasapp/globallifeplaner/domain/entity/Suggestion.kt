package com.ideasapp.globallifeplaner.domain.entity

data class Suggestion(
    val planEvent: PlanEvent,
    val condition: String = planEvent.condition + "is done"
)
