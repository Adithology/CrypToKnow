package com.kriptoadit.a10120240.model.home

import com.google.gson.annotations.SerializedName


data class CryptoResponse(
    @SerializedName("data")
    val `data`: List<Data>?,
    @SerializedName("status")
    val status: Status?
)