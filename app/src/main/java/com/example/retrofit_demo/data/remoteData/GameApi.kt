package com.example.retrofit_demo.data.remoteData

import com.example.retrofit_demo.data.remoteData.model.GamesModel
import com.example.retrofit_demo.utils.Constants.Companion.ENDPOINT
import retrofit2.Response
import retrofit2.http.GET

interface GameApi {

    @GET(ENDPOINT)
    suspend fun getGames() : Response<List<GamesModel>>
}