package com.kriptoadit.a10120240.model.detail

import com.google.gson.annotations.SerializedName


data class Platform(
    @SerializedName("coin")
    val coin: Coin?,
    @SerializedName("name")
    val name: String?
)