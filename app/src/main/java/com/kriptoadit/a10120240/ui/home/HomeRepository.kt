package com.kriptoadit.a10120240.ui.home

import com.kriptoadit.a10120240.base.BaseRepository
import com.kriptoadit.a10120240.network.ApiFactory
import javax.inject.Inject

class HomeRepository @Inject constructor(private val apiFactory: ApiFactory) : BaseRepository() {

    suspend fun getData(
        apiKey: String,
        limit: String
    ) = safeApiRequest {
        apiFactory.getData(apiKey, limit)
    }
}