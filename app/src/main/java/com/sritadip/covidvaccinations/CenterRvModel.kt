package com.sritadip.covidvaccinations

data class CenterRvModel(
    val centerName: String,
    val centerAddress: String,
    val centerFromTime: String,
    val centerToTime: String,
    var fee_type: String,
    var age_limit: Int,
    var vaccineName: String,
    var availableCapacity: Int
)
