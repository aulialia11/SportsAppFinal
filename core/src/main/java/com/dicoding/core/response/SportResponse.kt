package com.dicoding.core.response

import com.google.gson.annotations.SerializedName

data class SportResponse(
    @field:SerializedName("idSport")
    val idSport: String = "",

    @field:SerializedName("strSport")
    val strSport: String? = "",

    @field:SerializedName("strFormat")
    val strFormat: String? = "",

    @field:SerializedName("strSportThumb")
    val strSportThumb: String? = "",

    @field:SerializedName("strSportDescription")
    val strSportDescription: String? = ""
)