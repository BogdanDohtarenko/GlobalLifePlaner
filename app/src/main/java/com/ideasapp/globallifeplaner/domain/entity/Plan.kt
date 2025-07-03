package com.ideasapp.globallifeplaner.domain.entity

import java.util.Date

data class Plan (
    val dateStart: Date,
    val dateEnd: Date,
    val planEvents: List<PlanEvent>
)
