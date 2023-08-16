package com.kriptoadit.a10120240.model.home

import com.google.gson.annotations.SerializedName


data class Quote(
    @SerializedName("USD")
    val uSD: USD?
)