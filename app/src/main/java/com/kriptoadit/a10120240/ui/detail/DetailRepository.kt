package com.kriptoadit.a10120240.ui.detail

import com.kriptoadit.a10120240.base.BaseRepository
import com.kriptoadit.a10120240.network.ApiFactory
import javax.inject.Inject


class DetailRepository @Inject constructor(private val apiFactory: ApiFactory) : BaseRepository() {

    suspend fun getDetail(
        apiKey: String,
        symbol: String
    ) = safeApiRequest {
        apiFactory.getDetail(apiKey, symbol)
    }
}