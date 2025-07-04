package com.ideasapp.globallifeplaner.presentation.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SuggestionScreen(
    modifier: Modifier = Modifier
) {
    Column {
        ShowDate()
        ShowDonePlan()
        ShowWeatherForTodayAndTomorrow()
    }
}