package com.kriptoadit.a10120240.model.detail

import com.google.gson.annotations.SerializedName

data class DetailResponse(
    @SerializedName("data")
    val `data`: Any?,
    @SerializedName("status")
    val status: Status?
)