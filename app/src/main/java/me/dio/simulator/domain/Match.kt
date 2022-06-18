package me.dio.simulator.domain

import android.accounts.AuthenticatorDescription

data class Match(
    val description: String,
    val place: Place,
    val homeTeam: Team,
    val awayTeam: Team
)