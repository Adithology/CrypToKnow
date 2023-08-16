package com.kriptoadit.a10120240.model.errorResponse

import com.google.gson.annotations.SerializedName


data class ErrorResponse(
    @SerializedName("status")
    val status: Status?
)