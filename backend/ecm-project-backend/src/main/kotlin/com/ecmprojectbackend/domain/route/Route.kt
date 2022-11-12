package com.ecmprojectbackend.domain.route

import com.ecmprojectbackend.domain.activity.Activity

data class Route (
    val id: Long?,
    val name: String,
    val key: String,
    val content: String,
    val activity: Activity?,
    val nextActivity: Activity?
        )