package com.example.retrofit_demo.repository

import com.example.retrofit_demo.data.remoteData.GameService
import com.example.retrofit_demo.domain.item.GameItem
import com.example.retrofit_demo.domain.item.toGameItem
import javax.inject.Inject

class GameRepository @Inject constructor(private val gameService: GameService) {

    suspend fun getGames(): List<GameItem> {
        return gameService.getGames().map {
            it.toGameItem()
        }
    }
}