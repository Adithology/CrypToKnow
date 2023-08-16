package com.kriptoadit.a10120240.model.detail

import com.google.gson.annotations.SerializedName


data class ContractAddress(
    @SerializedName("contract_address")
    val contractAddress: String?,
    @SerializedName("platform")
    val platform: Platform?
)